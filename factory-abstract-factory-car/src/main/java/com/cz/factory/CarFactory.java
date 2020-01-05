package com.cz.factory;

import com.cz.product.RegularCar;
import com.cz.product.SportsCar;

/**
 * @author CHANG Zheng
 * @version 1.0.0
 * @projectName design-patterns
 * @date 2020/1/4 11:38
 */
public interface CarFactory
{
    RegularCar createRegularCar();

    SportsCar createSportsCar();
}
