package com.epam.dao.daointerface.daopattern;

import com.epam.dao.daointerface.StudenDaoImplementation;
import com.epam.dao.daointerface.StudentDao;
import com.epam.dao.daointerface.daoclass.Student;

public class DaoPattern {
    public static void main(String[] args) {
        StudentDao studentDao = new StudenDaoImplementation();

        for (Student student : studentDao.getAllStudents()){
            System.out.println("Student: [RollNum : " + student.getRollNum() + ", Name : " + student.getName() + " ]");
        }

        Student student = studentDao.getAllStudents().get(0);
        student.setName("Aidos");
        studentDao.updateStudent(student);

        studentDao.getSudent(0);
        System.out.println("Student: [RollNum : " + student.getRollNum() + ", Name : " + student.getName() + " ]");
    }
}
