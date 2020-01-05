package com.cz.adaptee.concrete;

import com.cz.adaptee.ThreePhaseOutlet;

/**
 * @author CHANG Zheng
 * @version 1.0.0
 * @projectName design-patterns
 * @date 2020/1/4 15:26
 */
public class ConcreteThreePhaseOutlet implements ThreePhaseOutlet
{
    public void threePhasePlugin()
    {
        System.out.println("this three phase outlet plugined");
    }
}
