package com.cz;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author CHANG Zheng
 * @version 1.0.0
 * @projectName design-patterns
 * @date 2020/1/4 21:44
 */
public class SubjectHandler implements InvocationHandler
{
    private Object abstractSubject;

    public void setAbstractSubject(Object realSubject)
    {
        this.abstractSubject = realSubject;
    }

    @Override
    public Object invoke(Object obj, Method method, Object[] args) throws Throwable
    {
        //利用反射机制将请求分派给委托类处理。Method的invoke返回Object对象作为方法执行结果。
        //因为示例程序没有返回值，所以这里忽略了返回值处理
        method.invoke(abstractSubject, args);
        System.out.println("孩子打酱油");
        return null;
    }

}
