package com.cz.subject.concrete;

import com.cz.subject.Cook;

/**
 * @author CHANG Zheng
 * @version 1.0.0
 * @projectName design-patterns
 * @date 2020/1/4 21:09
 */
public class Mother implements Cook
{

    @Override
    public void cook()
    {
        System.out.println("母亲做饭");
    }
}
