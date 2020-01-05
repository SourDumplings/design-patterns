package com.cz;

import com.cz.context.AbstractDuck;
import com.cz.context.concrete.DecoyDuck;
import com.cz.context.concrete.RedHeadDuck;
import com.cz.context.concrete.RubberDuck;

public class Main
{

    public static void main(String[] args)
    {
        AbstractDuck redHeadDuck = new RedHeadDuck();
        AbstractDuck rubberDuck = new RubberDuck();
        AbstractDuck decoyDuck = new DecoyDuck();

        redHeadDuck.performQuack();
        rubberDuck.performQuack();
        decoyDuck.performQuack();
    }
}
