
package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Saving some sample data
        Student student = new Student();
        student.setName("John Doe");
        student.setCourse("Computer Science");
        studentRepository.save(student);

        // Printing out the saved student
        studentRepository.findAll().forEach(s -> System.out.println(s.getName()));
    }
}
