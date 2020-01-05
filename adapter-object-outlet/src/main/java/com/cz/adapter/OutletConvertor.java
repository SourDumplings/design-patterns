package com.cz.adapter;

import com.cz.adaptee.ThreePhaseOutlet;
import com.cz.target.TwoPhaseOutlet;

/**
 * @author CHANG Zheng
 * @version 1.0.0
 * @projectName design-patterns
 * @date 2020/1/4 15:33
 */
public class OutletConvertor implements TwoPhaseOutlet
{
    private ThreePhaseOutlet threePhaseOutlet;

    public OutletConvertor(ThreePhaseOutlet threePhaseOutlet)
    {
        this.threePhaseOutlet = threePhaseOutlet;
    }

    public void twoPhasePlugin()
    {
        threePhaseOutlet.threePhasePlugin();
    }
}
