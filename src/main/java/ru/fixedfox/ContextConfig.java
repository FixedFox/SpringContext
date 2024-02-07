package ru.fixedfox;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.fixedfox.data.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
@ComponentScan("ru.fixedfox")
public class ContextConfig {

    @Bean
    public Student studentRayan() {
        var student = new Student();
        student.name = "Rayan";
        student.mapOfSubjectGrades =
                new HashMap<String, Integer>(
                        Map.of(
                                "Math", 3,
                                "Language", 2,
                                "IT", 5));

        return student;
    }

    @Bean
    public Student studentJames() {
        var student = new Student();
        student.name = "James";
        student.mapOfSubjectGrades =
                new HashMap<String, Integer>(
                        Map.of(
                                "Math", 3,
                                "Language", 4,
                                "IT", 3));

        return student;
    }

    @Bean
    public Student studentJil() {
        var student = new Student();
        student.name = "Jil";student.mapOfSubjectGrades =
                new HashMap<String, Integer>(
                        Map.of(
                                "Math", 2,
                                "Language", 2,
                                "IT", 2));

        return student;
    }

    @Bean
    public List<Student> studentBean() {
        return new ArrayList<Student>(
                List.of(
                        studentRayan(),
                        studentJames(),
                        studentRayan()));
    }
}
