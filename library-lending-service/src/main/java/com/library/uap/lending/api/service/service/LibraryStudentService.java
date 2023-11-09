package com.library.uap.lending.api.service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.uap.lending.api.service.models.Student;
import com.library.uap.lending.api.service.repository.StudentMapper;

import java.util.List;

@Service
public class LibraryStudentService {

    @Autowired
    private StudentMapper studentMapper;

    public void addStudent(Student student) {
        studentMapper.insertStudent(student);
    }

    public Student getStudentById(Long id) {
        return studentMapper.selectStudentById(id);
    }

    public List<Student> getAllStudents() {
        return studentMapper.selectAllStudents();
    }
}