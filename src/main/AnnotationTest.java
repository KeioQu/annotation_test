package main;

import main.annotation.MyTag;

import java.lang.annotation.Annotation;

public class AnnotationTest {
    public static void main(String[] args){
        try {
            Class clazz = Class.forName("main.test.Test");
            Annotation annotation = clazz.getAnnotation(MyTag.class);
            if (null != annotation){
                String name = ((MyTag)annotation).name();
                int age = ((MyTag)annotation).age();
                System.out.println("name : " + name + ", age : " + age);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
