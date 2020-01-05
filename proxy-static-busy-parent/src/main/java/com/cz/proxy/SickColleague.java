package com.cz.proxy;

import com.cz.subject.Worker;

/**
 * @author CHANG Zheng
 * @version 1.0.0
 * @projectName design-patterns
 * @date 2020/1/4 22:07
 */
public class SickColleague implements Worker
{
    private Worker colleague;

    public SickColleague(Worker colleague)
    {
        this.colleague = colleague;
    }

    @Override
    public void work()
    {
        colleague.work();
        System.out.println("同事请假养病");
    }
}
