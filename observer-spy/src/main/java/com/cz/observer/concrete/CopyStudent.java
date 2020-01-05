package com.cz.observer.concrete;

import com.cz.observer.Student;

/**
 * @author CHANG Zheng
 * @version 1.0.0
 * @projectName design-patterns
 * @date 2020/1/4 18:49
 */
public class CopyStudent implements Student
{
    @Override
    public void onTeacherComing()
    {
        System.out.println("stop copying homework");
    }
}
