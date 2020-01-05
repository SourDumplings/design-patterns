package com.cz.decorator.concrete;

import com.cz.component.Beverage;
import com.cz.decorator.Ingredient;

/**
 * @author CHANG Zheng
 * @version 1.0.0
 * @projectName design-patterns
 * @date 2020/1/4 17:51
 */
public class Milk implements Ingredient
{
    private Beverage beverage;

    public Milk(Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override
    public String  getDescription()
    {
        return beverage.getDescription() + " with milk";
    }
}
