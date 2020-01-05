package com.cz.factory.concrete;

import com.cz.factory.BMWFactory;
import com.cz.product.BMW;
import com.cz.product.concrete.BMW523;

/**
 * @author CHANG Zheng
 * @version 1.0.0
 * @projectName design-patterns
 * @date 2020/1/4 10:28
 */
public class BMW523Factory implements BMWFactory
{
    public BMW createBMW()
    {
        return new BMW523();
    }
}
