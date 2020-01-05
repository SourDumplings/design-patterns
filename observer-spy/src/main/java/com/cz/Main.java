package com.cz;

import com.cz.observer.Student;
import com.cz.observer.concrete.CopyStudent;
import com.cz.observer.concrete.GameStudent;
import com.cz.subject.AbstractSpy;
import com.cz.subject.concrete.Monitor;

/**
 * @author CHANG Zheng
 * @version 1.0.0
 * @projectName design-patterns
 * @date 2020/1/4 18:46
 */
public class Main
{
    public static void main(String[] args)
    {
        Student copyStudent1 = new CopyStudent();
        Student copyStudent2 = new CopyStudent();
        Student gameStudent = new GameStudent();

        AbstractSpy monitor = new Monitor();
        monitor.attach(copyStudent1);
        monitor.attach(copyStudent2);
        monitor.attach(gameStudent);

        System.out.println("Teacher is comming!");
        monitor.notifyObservers();
    }

}
