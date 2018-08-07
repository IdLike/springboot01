package com.cl.springboot.repository;

import com.cl.springboot.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StrudentRepository extends JpaRepository<Student,Integer> {

    public  List<Student>findByClassName(String className);
}
