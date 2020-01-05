package com.cz.factory.concrete;

import com.cz.factory.CarFactory;
import com.cz.product.RegularCar;
import com.cz.product.SportsCar;
import com.cz.product.concrete.BMWRegularCar;
import com.cz.product.concrete.BMWSportsCar;

/**
 * @author CHANG Zheng
 * @version 1.0.0
 * @projectName design-patterns
 * @date 2020/1/4 11:43
 */
public class BMWFactory implements CarFactory
{
    public RegularCar createRegularCar()
    {
        return new BMWRegularCar();
    }

    public SportsCar createSportsCar()
    {
        return new BMWSportsCar();
    }
}
