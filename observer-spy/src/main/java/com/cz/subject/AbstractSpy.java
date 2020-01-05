package com.cz.subject;

import com.cz.observer.Student;
import java.util.HashSet;
import java.util.Set;

/**
 * @author CHANG Zheng
 * @version 1.0.0
 * @projectName design-patterns
 * @date 2020/1/4 18:50
 */
public abstract class AbstractSpy
{
    private Set<Student> observers = new HashSet<>();

    protected Set<Student> getObservers()
    {
        return observers;
    }

    public void attach(Student student)
    {
        observers.add(student);
    }

    public void detach(Student student)
    {
        observers.remove(student);
    }

    public abstract void notifyObservers();
}
