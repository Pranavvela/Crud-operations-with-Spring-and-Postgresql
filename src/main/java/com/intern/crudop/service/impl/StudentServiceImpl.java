package com.intern.crudop.service.impl;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.intern.crudop.dto.StudentDto;
import com.intern.crudop.entity.Student;
import com.intern.crudop.exception.ResourceNotFoundException;
import com.intern.crudop.mapper.StudentMapper;
import com.intern.crudop.repository.StudentRepository;
import com.intern.crudop.service.StudentService;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService{
    private final StudentRepository studentRepository;
    @Override
    public StudentDto createStudent(StudentDto studentDto) {
        // Here you would typically call a repository to save the student
        // For now, we will just return the same DTO for demonstration purposes
        Student student = StudentMapper.mapToStudent(studentDto);
        Student savedStudent = studentRepository.save(student);
        return StudentMapper.mapToStudentDto(savedStudent);
    }
    @Override
    public StudentDto getStudentById(Long id) {
        Student student = studentRepository.findById(id)
            .orElseThrow(() -> 
            new ResourceNotFoundException("Student not found with id: " + id));
        return StudentMapper.mapToStudentDto(student);
    }
    @Override
    public List<StudentDto> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        return students.stream().map((student) -> StudentMapper.mapToStudentDto(student))
            .collect(Collectors.toList());

    }  
    @Override  //github copilot edited : check video for this prompt

    public StudentDto updateStudent(Long studentId, StudentDto updatedStudent) {
        Student student = studentRepository.findById(studentId)
            .orElseThrow(() -> new ResourceNotFoundException("Student not found with id: " + studentId));

        student.setFirstName(updatedStudent.getFirstName());
        student.setLastName(updatedStudent.getLastName());
        student.setEmail(updatedStudent.getEmail());
        // Add other fields as necessary

        Student updatedStudentObj = studentRepository.save(student);
        return StudentMapper.mapToStudentDto(updatedStudentObj);
         
    }
    @Override
    public void deleteStudent(Long studentId) {
        studentRepository.findById(studentId)
            .orElseThrow(() -> new ResourceNotFoundException("Student not found with id: " + studentId)); 
        studentRepository.deleteById(studentId);
    }
}
