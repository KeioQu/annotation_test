package main.action;

import main.test.Student;
import main.utils.AccessUtil;

public class StudentAction {
    public void visit(Student student){
        if (AccessUtil.accessValidated(student)) {
            System.out.println(student.getName() + "," + student.getAge() + "visited");
        }else {
            System.out.println(student.getName() + "," + student.getAge() + "can not visited");
        }
    }
}
