package com.cz.adapter;

import com.cz.adaptee.concrete.ConcreteThreePhaseOutlet;
import com.cz.target.TwoPhaseOutlet;

/**
 * @author CHANG Zheng
 * @version 1.0.0
 * @projectName design-patterns
 * @date 2020/1/4 15:33
 */
public class OutletConvertor extends ConcreteThreePhaseOutlet implements TwoPhaseOutlet
{
    public void twoPhasePlugin()
    {
        threePhasePlugin();
    }
}
