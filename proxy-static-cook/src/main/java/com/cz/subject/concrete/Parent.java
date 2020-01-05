package com.cz.subject.concrete;

import com.cz.subject.Cook;

/**
 * @author CHANG Zheng
 * @version 1.0.0
 * @projectName design-patterns
 * @date 2020/1/4 20:33
 */
public class Parent implements Cook
{
    @Override
    public void cook()
    {
        System.out.println("父母做饭");
    }
}
