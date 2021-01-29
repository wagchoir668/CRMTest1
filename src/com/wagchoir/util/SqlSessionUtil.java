package com.wagchoir.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtil {
    private SqlSessionUtil(){}//工具类的构造方法私有化，让使用者无法new此类的对象
    private static SqlSessionFactory factory;

    static{
        String resource = "mybatis-config.xml";
        InputStream input = null;

        try {
            input = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }

        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        factory = builder.build(input);
    }

    //存放SqlSession的池子/容器
    private static ThreadLocal<SqlSession> t = new ThreadLocal<>();

    public static SqlSession getSession()
    {
        SqlSession session = t.get();
        if(session==null)
        {
            session = factory.openSession();
            t.set(session);
        }

        return session;
    }

    public static void closeSession(SqlSession session)
    {
        if(session!=null)
        {
            session.close();

            t.remove();//将session与线程剥离，非常重要
        }
    }
}
