package com.epam.dao.daointerface;

import com.epam.dao.daointerface.daoclass.Student;

import java.util.List;

public interface StudentDao {
    public List<Student> getAllStudents();
    public Student getSudent(int rollnum);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}
