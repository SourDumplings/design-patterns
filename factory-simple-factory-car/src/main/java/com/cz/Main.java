package com.cz;

import com.cz.factory.BMWFactory;
import com.cz.product.BMW;

/**
 * @author CHANG Zheng
 * @version 1.0.0
 * @projectName design-patterns
 * @date 2020/1/4 9:12
 */
public class Main
{
    public static void main(String[] args)
    {
        final BMW bmw320 = BMWFactory.createBMW("BMW320");
        final BMW bmw523 = BMWFactory.createBMW("BMW523");
    }
}
