package com.cz.strategy.concrete;

import com.cz.strategy.QuackBehavior;

/**
 * @author CHANG Zheng
 * @version 1.0.0
 * @projectName 策略模式-鸭子叫
 * @date 2020/1/3 20:50
 */
public class NoQuack implements QuackBehavior
{
    @Override
    public void quack()
    {
        System.out.println("No Quack");
    }
}
