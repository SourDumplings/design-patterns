package com.cz.template;

/**
 * @author CHANG Zheng
 * @version 1.0.0
 * @projectName design-patterns
 * @date 2020/1/4 14:40
 */
public abstract class TestPaper
{
    private String name;

    public TestPaper(String name)
    {
        this.name = name;
    }

    protected abstract void test1();

    protected abstract void test2();

    public void startTest()
    {
        System.out.println(name + " starts test.");
        test1();
        test2();
    }
}
