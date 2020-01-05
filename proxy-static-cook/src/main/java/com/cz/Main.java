package com.cz;

import com.cz.proxy.Child;
import com.cz.subject.Cook;
import com.cz.subject.concrete.Parent;

/**
 * @author CHANG Zheng
 * @version 1.0.0
 * @projectName design-patterns
 * @date 2020/1/4 20:32
 */
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("老师让孩子回家做饭，实际情况是：");

        Cook child = new Child(new Parent());
        child.cook();
    }
}
