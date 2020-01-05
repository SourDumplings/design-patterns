package com.cz.factory.concrete;

import com.cz.factory.BMWFactory;
import com.cz.product.BMW;
import com.cz.product.concrete.BMW320;

/**
 * @author CHANG Zheng
 * @version 1.0.0
 * @projectName design-patterns
 * @date 2020/1/4 10:27
 */
public class BMW320Factory implements BMWFactory
{
    public BMW createBMW()
    {
        return new BMW320();
    }
}
