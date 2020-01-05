package com.cz.singleton;

public class Emperor
{

    private static volatile  Emperor emperor;

    private Emperor()
    {
        System.out.println("皇帝登基了");
    }

    public static Emperor getInstance()
    {
        if (emperor == null)
        {
            synchronized (Emperor.class)
            {
                if (emperor == null)
                {
                    emperor = new Emperor();
                }
            }
        }
        return emperor;
    }
}  