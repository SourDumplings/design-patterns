package com.cz;

import com.cz.factory.BMWFactory;
import com.cz.factory.concrete.BMW320Factory;
import com.cz.factory.concrete.BMW523Factory;

/**
 * @author CHANG Zheng
 * @version 1.0.0
 * @projectName design-patterns
 * @date 2020/1/4 10:28
 */
public class Main
{
    public static void main(String[] args)
    {
        final BMWFactory bmw320Factory = new BMW320Factory();
        final BMWFactory bmw523Factory = new BMW523Factory();
        bmw320Factory.createBMW();
        bmw523Factory.createBMW();
    }
}
