package com.cz;

import com.cz.singleton.Emperor;

public class Main
{

    public static void main(String[] args)
    {
        for (int day = 0; day < 10; day++)
        {
            Runnable r = () ->
            {
                final Emperor emperorToday = Emperor.getInstance();
            };
            new Thread(r).start();
        }
    }
}
