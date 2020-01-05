package com.cz.decorator.concrete;

import com.cz.decorator.AbstractEmotion;
import com.cz.subject.concrete.Parent;

/**
 * @author CHANG Zheng
 * @version 1.0.0
 * @projectName design-patterns
 * @date 2020/1/4 22:12
 */
public class Angry extends AbstractEmotion
{
    private Parent parent;

    public Angry(Parent parent)
    {
        this.parent = parent;
    }

    @Override
    public void cook()
    {
        parent.cook();
        System.out.println("父母做饭做的很生气");
    }

    @Override
    public void work()
    {
        parent.work();
        System.out.println("父母帮同事工作很不爽");

    }
}
