package com.cz.context;

import com.cz.strategy.QuackBehavior;

/**
 * @author CHANG Zheng
 * @version 1.0.0
 * @projectName 策略模式-鸭子叫
 * @date 2020/1/3 20:41
 */
public abstract class AbstractDuck
{
    private QuackBehavior quackBehavior;

    public void performQuack()
    {
        quackBehavior.quack();
    }

    protected void setQuackBehavior(QuackBehavior quackBehavior)
    {
        this.quackBehavior = quackBehavior;
    }
}
