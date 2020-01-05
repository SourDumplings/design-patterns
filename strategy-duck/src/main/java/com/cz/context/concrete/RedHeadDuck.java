package com.cz.context.concrete;

import com.cz.context.AbstractDuck;
import com.cz.strategy.concrete.NormalQuack;

/**
 * @author CHANG Zheng
 * @version 1.0.0
 * @projectName 策略模式-鸭子叫
 * @date 2020/1/3 20:44
 */
public class RedHeadDuck extends AbstractDuck
{
    public RedHeadDuck()
    {
        setQuackBehavior(new NormalQuack());
    }
}
