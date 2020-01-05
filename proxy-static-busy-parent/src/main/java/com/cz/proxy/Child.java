package com.cz.proxy;

import com.cz.subject.Cook;

/**
 * @author CHANG Zheng
 * @version 1.0.0
 * @projectName design-patterns
 * @date 2020/1/4 22:07
 */
public class Child implements Cook
{
    private Cook parent;

    public Child(Cook parent)
    {
        this.parent = parent;
    }

    @Override
    public void cook()
    {
        parent.cook();
        System.out.println("孩子打酱油");
    }
}
