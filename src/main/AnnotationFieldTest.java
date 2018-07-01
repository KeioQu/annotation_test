package main;

import main.action.StudentAction;
import main.test.CollegeStudent;
import main.test.Student;

public class AnnotationFieldTest {
    public static  void main(String[] args){
        Student student = new Student("小明",12);
        StudentAction action = new StudentAction();
        action.visit(student);
    }
}
