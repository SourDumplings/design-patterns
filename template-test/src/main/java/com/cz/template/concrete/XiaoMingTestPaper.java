package com.cz.template.concrete;

import com.cz.template.TestPaper;

/**
 * @author CHANG Zheng
 * @version 1.0.0
 * @projectName design-patterns
 * @date 2020/1/4 14:45
 */
public class XiaoMingTestPaper extends TestPaper
{
    public XiaoMingTestPaper()
    {
        super("Xiao Ming");
    }

    @Override
    protected void test1()
    {
        System.out.println("Xiao Ming does test1");
    }

    @Override
    protected void test2()
    {
        System.out.println("Xiao Ming does test2");
    }
}
