package com.naveen.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.naveen.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
