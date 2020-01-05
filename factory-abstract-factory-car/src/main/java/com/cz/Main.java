package com.cz;

import com.cz.factory.CarFactory;
import com.cz.factory.concrete.BMWFactory;
import com.cz.factory.concrete.BZFactory;

/**
 * @author CHANG Zheng
 * @version 1.0.0
 * @projectName design-patterns
 * @date 2020/1/4 11:38
 */
public class Main
{
    public static void main(String[] args)
    {
        final CarFactory bmwFactory = new BMWFactory();
        final CarFactory bzFactory = new BZFactory();

        bmwFactory.createRegularCar();
        bmwFactory.createSportsCar();

        bzFactory.createRegularCar();
        bzFactory.createSportsCar();
    }
}
