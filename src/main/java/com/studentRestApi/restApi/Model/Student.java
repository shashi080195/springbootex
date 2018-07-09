package com.studentRestApi.restApi.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="student")
public class Student {

    @Id
    public String id;

    public String username;
    public String password;

    public Student() {}

    public Student(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format(
                "Student[id=%s, username='%s', password='%s']",
                id, username, password);
    }

}
