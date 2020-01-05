package com.cz.component.concrete;

import com.cz.component.Beverage;

/**
 * @author CHANG Zheng
 * @version 1.0.0
 * @projectName design-patterns
 * @date 2020/1/4 17:36
 */
public class Coffee implements Beverage
{

    @Override
    public String getDescription()
    {
        return "Coffee";
    }
}
