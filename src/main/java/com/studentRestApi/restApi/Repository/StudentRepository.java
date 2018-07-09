package com.studentRestApi.restApi.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.studentRestApi.restApi.Model.Student;

public interface StudentRepository extends MongoRepository<Student, String> {

}
