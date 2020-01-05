package com.cz;

import com.cz.template.TestPaper;
import com.cz.template.concrete.XiaoHongTestPaper;
import com.cz.template.concrete.XiaoMingTestPaper;

/**
 * @author CHANG Zheng
 * @version 1.0.0
 * @projectName design-patterns
 * @date 2020/1/4 14:40
 */
public class Main
{
    public static void main(String[] args)
    {
        TestPaper xiaoHongTestPaper = new XiaoHongTestPaper();
        xiaoHongTestPaper.startTest();

        TestPaper xiaoMingTestPaper = new XiaoMingTestPaper();
        xiaoMingTestPaper.startTest();
    }
}
