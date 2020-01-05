package com.cz.subject.concrete;

import com.cz.subject.Cook;
import com.cz.subject.Worker;

/**
 * @author CHANG Zheng
 * @version 1.0.0
 * @projectName design-patterns
 * @date 2020/1/4 20:33
 */
public class Parent implements Cook, Worker
{
    @Override
    public void cook()
    {
        System.out.println("父母做饭");
    }

    @Override
    public void work()
    {
        System.out.println("父母帮同事工作");
    }
}
