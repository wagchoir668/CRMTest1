package com.wagchoir.util;

public class ServiceFactory {
    //传一个目标类对象，获得一个代理类对象
    public static Object getService(Object service)
    {
        return new TransactionInvocationHandler(service).getProxy();
    }
}
