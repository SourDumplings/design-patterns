package com.cz;

import com.cz.decorator.concrete.Angry;
import com.cz.proxy.Child;
import com.cz.proxy.SickColleague;
import com.cz.subject.Cook;
import com.cz.subject.Worker;
import com.cz.subject.concrete.Parent;

/**
 * @author CHANG Zheng
 * @version 1.0.0
 * @projectName design-patterns
 * @date 2020/1/4 22:05
 */
public class Main
{
    public static void main(String[] args)
    {
        Parent parent = new Parent();
        Angry angryParent = new Angry(parent);

        System.out.println("老师让孩子回家做饭，实际情况是：");
        Cook cookingchild = new Child(angryParent);
        cookingchild.cook();

        System.out.println("老板让同事工作，实际情况是：");
        Worker workingColleague = new SickColleague(angryParent);
        workingColleague.work();
    }
}
