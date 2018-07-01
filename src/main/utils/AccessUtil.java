package main.utils;

import main.annotation.Access;
import main.test.Student;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class AccessUtil {
    public static  boolean accessValidated(Student student){
        try {
            Class clazz = Class.forName("main.test.CollegeStudent");
            for(; clazz != Object.class; clazz = clazz.getSuperclass()) {
                System.out.println(clazz.getName());
                Field[] fields = clazz.getDeclaredFields();
                for (Field field : fields) {
                    System.out.println(field.getName());
                }
            }
            //该field为非public
            Field field = Class.forName("main.test.Student").getDeclaredField("age");
            Annotation annotation = field.getAnnotation(Access.class);
            if (null != annotation){
                int accessAge = ((Access)annotation).value();
                if (accessAge > student.getAge()){
                    return  false;
                }else {
                    return true;
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        return  false;
    }
}
