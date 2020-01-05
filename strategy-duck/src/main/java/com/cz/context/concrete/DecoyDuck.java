package com.cz.context.concrete;

import com.cz.context.AbstractDuck;
import com.cz.strategy.concrete.NoQuack;

/**
 * @author CHANG Zheng
 * @version 1.0.0
 * @projectName 策略模式-鸭子叫
 * @date 2020/1/3 20:57
 */
public class DecoyDuck extends AbstractDuck
{
    public DecoyDuck()
    {
        setQuackBehavior(new NoQuack());
    }
}
