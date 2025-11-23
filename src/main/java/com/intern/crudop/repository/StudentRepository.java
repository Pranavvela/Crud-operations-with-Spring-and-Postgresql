package com.intern.crudop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intern.crudop.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    

}
