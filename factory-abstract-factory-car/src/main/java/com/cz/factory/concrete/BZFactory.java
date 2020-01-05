package com.cz.factory.concrete;

import com.cz.factory.CarFactory;
import com.cz.product.RegularCar;
import com.cz.product.SportsCar;
import com.cz.product.concrete.BZRegularCar;
import com.cz.product.concrete.BZSportsCar;

/**
 * @author CHANG Zheng
 * @version 1.0.0
 * @projectName design-patterns
 * @date 2020/1/4 11:44
 */
public class BZFactory implements CarFactory
{
    public RegularCar createRegularCar()
    {
        return new BZRegularCar();
    }

    public SportsCar createSportsCar()
    {
        return new BZSportsCar();
    }
}
