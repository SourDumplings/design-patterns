package com.cz.subject.concrete;

import com.cz.observer.Student;
import com.cz.subject.AbstractSpy;
import java.util.Set;

/**
 * @author CHANG Zheng
 * @version 1.0.0
 * @projectName design-patterns
 * @date 2020/1/4 19:04
 */
public class Monitor extends AbstractSpy
{
    @Override
    public void notifyObservers()
    {
        final Set<Student> observers = getObservers();
        for (Student observer : observers)
        {
            observer.onTeacherComing();
        }
    }
}
