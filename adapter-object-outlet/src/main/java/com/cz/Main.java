package com.cz;

import com.cz.adaptee.ThreePhaseOutlet;
import com.cz.adaptee.concrete.ConcreteThreePhaseOutlet;
import com.cz.adapter.OutletConvertor;
import com.cz.client.CellPhone;

/**
 * @author CHANG Zheng
 * @version 1.0.0
 * @projectName design-patterns
 * @date 2020/1/4 15:18
 */
public class Main
{
    public static void main(String[] args)
    {
        CellPhone cellPhone = new CellPhone();
        ThreePhaseOutlet concreteThreePhaseOutlet = new ConcreteThreePhaseOutlet();
        OutletConvertor outletConvertor = new OutletConvertor(concreteThreePhaseOutlet);
        cellPhone.charge(outletConvertor);
    }
}
