package com.cz;

import com.cz.subject.Cook;
import com.cz.subject.Washer;
import com.cz.subject.concrete.Father;
import com.cz.subject.concrete.Mother;
import java.lang.reflect.Proxy;

/**
 * @author CHANG Zheng
 * @version 1.0.0
 * @projectName design-patterns
 * @date 2020/1/4 20:32
 */
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("老师让孩子回家做饭和洗碗，实际情况是：");

        Mother mother = new Mother();
        Father father = new Father();

        SubjectHandler handler = new SubjectHandler();

        //生成代理类对象
        handler.setAbstractSubject(mother);
        Cook cookingChild = (Cook) Proxy
            .newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Cook.class},
                handler);
        cookingChild.cook();

        handler.setAbstractSubject(father);
        Washer washeringChild = (Washer) Proxy
            .newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Washer.class},
                handler);
        washeringChild.wash();
    }
}
