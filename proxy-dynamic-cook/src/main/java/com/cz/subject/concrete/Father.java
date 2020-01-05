package com.cz.subject.concrete;

import com.cz.subject.Washer;

/**
 * @author CHANG Zheng
 * @version 1.0.0
 * @projectName design-patterns
 * @date 2020/1/4 21:43
 */
public class Father implements Washer
{
    @Override
    public void wash()
    {
        System.out.println("父亲洗碗");
    }
}
