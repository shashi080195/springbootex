package com.studentRestApi.restApi.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.studentRestApi.restApi.Model.Student;
import com.studentRestApi.restApi.Repository.StudentRepository;


@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentRepository studentRepository;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Student> getStudent(){
		return studentRepository.findAll();
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public Student setStudent(@RequestBody Student student) {
		return studentRepository.save(student);
	}
	
//	@RequestMapping(method=RequestMethod.GET, value= {id})
//	public Student findStudent() {
//		return studentRepository.findById(id);
//	}
}