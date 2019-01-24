package com.naveen.student.dal;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.naveen.student.dal.entities.Student;
import com.naveen.student.dal.repos.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentdalApplicationTests {

	@Autowired
	private StudentRepository studentRepository;

	@Test
	public void testCreateStudent() {
		Student entity = new Student();
		entity.setName("john");
		entity.setCourse("Java Web Services");
		entity.setFee(30d);

		studentRepository.save(entity);
	}

	@Test
	public void testFindStudentById() {

		Student optional = studentRepository.findById(1l).get();
		System.out.println(optional);
	}

	@Test
	public void testUpdateStudent() {

		Student optional = studentRepository.findById(1l).get();
		optional.setFee(40d);
		studentRepository.save(optional);
	}

	@Test
	public void testDeleteStudent() {

		studentRepository.deleteById(2l);
		;

	}
}
