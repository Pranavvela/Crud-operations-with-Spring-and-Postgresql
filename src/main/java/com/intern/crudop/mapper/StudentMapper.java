package com.intern.crudop.mapper;

import com.intern.crudop.dto.StudentDto;
import com.intern.crudop.entity.Student;

public class StudentMapper {

    // Private constructor to prevent instantiation
    private StudentMapper() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static StudentDto mapToStudentDto(Student student){
        return new StudentDto(
                student.getId(),
                student.getFirstName(),
                student.getLastName(),
                student.getEmail()
        );
    }

    public static Student mapToStudent(StudentDto studentDto){
        return new Student(
                studentDto.getId(),
                studentDto.getFirstName(),
                studentDto.getLastName(),
                studentDto.getEmail()
        );
    }
}
