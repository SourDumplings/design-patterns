package com.cz.template.concrete;

import com.cz.template.TestPaper;

/**
 * @author CHANG Zheng
 * @version 1.0.0
 * @projectName design-patterns
 * @date 2020/1/4 14:43
 */
public class XiaoHongTestPaper extends TestPaper
{

    public XiaoHongTestPaper()
    {
        super("Xiao Hong");
    }

    @Override
    protected void test1()
    {
        System.out.println("Xiao Hong does test1");
    }

    @Override
    protected void test2()
    {
        System.out.println("Xiao Hong does test2");
    }
}
