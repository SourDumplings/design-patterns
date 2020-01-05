package com.cz.factory;

import com.cz.product.BMW;
import com.cz.product.concrete.BMW320;
import com.cz.product.concrete.BMW523;

/**
 * @author CHANG Zheng
 * @version 1.0.0
 * @projectName design-patterns
 * @date 2020/1/4 9:17
 */
public class BMWFactory
{
    public static BMW createBMW(String type)
    {
        if ("BMW320".equals(type))
        {
            return new BMW320();
        }
        else if ("BMW523".equals(type))
        {
            return new BMW523();
        }
        return null;
    }
}
