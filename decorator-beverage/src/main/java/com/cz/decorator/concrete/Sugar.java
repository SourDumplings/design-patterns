package com.cz.decorator.concrete;

import com.cz.component.Beverage;
import com.cz.decorator.Ingredient;

/**
 * @author CHANG Zheng
 * @version 1.0.0
 * @projectName design-patterns
 * @date 2020/1/4 17:55
 */
public class Sugar implements Ingredient
{
    private Beverage beverage;

    public Sugar(Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override
    public String getDescription()
    {
        return beverage.getDescription() + " with sugar";
    }
}
