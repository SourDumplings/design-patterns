package com.cz;

import com.cz.component.Beverage;
import com.cz.component.concrete.Coffee;
import com.cz.component.concrete.Juice;
import com.cz.decorator.concrete.Milk;
import com.cz.decorator.concrete.Sugar;

/**
 * @author CHANG Zheng
 * @version 1.0.0
 * @projectName design-patterns
 * @date 2020/1/4 17:33
 */
public class Main
{
    public static void main(String[] args)
    {
        Beverage coffeeWithTwoMilk = new Milk(new Milk(new Coffee()));
        System.out.println(coffeeWithTwoMilk.getDescription());

        Beverage juickWithSugarAndMilk = new Milk(new Sugar(new Juice()));
        System.out.println(juickWithSugarAndMilk.getDescription());
    }

}
