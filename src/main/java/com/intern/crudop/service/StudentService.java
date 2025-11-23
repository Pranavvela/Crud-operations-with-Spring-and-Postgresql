package com.intern.crudop.service;

import java.util.List;

import com.intern.crudop.dto.StudentDto;

public interface StudentService {
    StudentDto createStudent(StudentDto studentDto);
    StudentDto getStudentById(Long id);
    List<StudentDto> getAllStudents();
    StudentDto updateStudent(Long studentid, StudentDto updatedStudent);
    void deleteStudent(Long studentId);
    
}
