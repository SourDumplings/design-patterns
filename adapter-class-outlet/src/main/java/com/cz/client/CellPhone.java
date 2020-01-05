package com.cz.client;

import com.cz.target.TwoPhaseOutlet;

/**
 * @author CHANG Zheng
 * @version 1.0.0
 * @projectName design-patterns
 * @date 2020/1/4 15:30
 */
public class CellPhone
{
    public void charge(TwoPhaseOutlet twoPhaseOutlet)
    {
        twoPhaseOutlet.twoPhasePlugin();
    }
}
