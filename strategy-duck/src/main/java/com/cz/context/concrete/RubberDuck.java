package com.cz.context.concrete;

import com.cz.context.AbstractDuck;
import com.cz.strategy.concrete.ArtificialQuack;

/**
 * @author CHANG Zheng
 * @version 1.0.0
 * @projectName 策略模式-鸭子叫
 * @date 2020/1/3 20:58
 */
public class RubberDuck extends AbstractDuck
{
    public RubberDuck()
    {
        setQuackBehavior(new ArtificialQuack());
    }
}
