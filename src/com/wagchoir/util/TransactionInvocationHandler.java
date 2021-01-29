package com.wagchoir.util;

import org.apache.ibatis.session.SqlSession;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//这个代码一定要背，是Spring中AOP的底层原理
public class TransactionInvocationHandler implements InvocationHandler {
    private Object target;//目标类对象（被代理者）

    public TransactionInvocationHandler(Object target)
    {this.target=target;}

    //invoke是代理类的业务方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        SqlSession session = null;
        Object obj = null;

        try{
            session = SqlSessionUtil.getSession();
            //处理业务逻辑
            obj = method.invoke(target,args);//method是目标类的业务方法
            //功能增强 体现在这里 给目标类的业务方法增加了提交事务的功能
            session.commit();//如果成功，提交事务
        }catch(Exception e)
        {
            session.rollback();//失败则回滚
        }finally {
            SqlSessionUtil.closeSession(session);
        }

        return obj;
    }

    //获取代理类对象
    public Object getProxy()
    {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),this);
    }
}
