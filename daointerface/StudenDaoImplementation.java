package com.epam.dao.daointerface;

import com.epam.dao.daointerface.daoclass.Student;

import java.util.ArrayList;
import java.util.List;

public class StudenDaoImplementation implements StudentDao{
    List<Student> students;

    public StudenDaoImplementation(){
        students = new ArrayList<Student>();
        Student student1 = new Student("Rob",0);
        Student student2 = new Student("Bobrik",1);
        students.add(student1);
        students.add(student2);
    }
    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getSudent(int rollNum) {
        return  students.get(rollNum);
    }

    @Override
    public void updateStudent(Student student) {
        students.get(student.getRollNum()).setName(student.getName());
        System.out.println("Student: Roll Num " + student.getRollNum() +  ", updated in the database");

    }

    @Override
    public void deleteStudent(Student student) {
        students.remove(student.getRollNum());
        System.out.println("Student: rollNum " + student.getRollNum() + "deleted from database");
    }
}
