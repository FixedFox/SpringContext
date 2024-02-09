package ru.fixedfox.model.contexts;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.fixedfox.model.data.Student;

import java.util.HashMap;
import java.util.Map;

@Configuration
@ComponentScan("ru.fixedfox.model.data")
public class ApplicationContext {

    @Bean
    public Student studentRayan() {
        var student = new Student();
        student.setName("Rayan");
        student.setMapOfSubjectGrades(
                new HashMap<>(
                        Map.of(
                                "Math", 3,
                                "Language", 2,
                                "IT", 5)));

        return student;
    }

    @Bean
    public Student studentJames() {
        var student = new Student();
        student.setName("James");
        student.setMapOfSubjectGrades(
                new HashMap<>(
                        Map.of(
                                "Math", 5,
                                "Language", 1,
                                "IT", 1)));

        return student;
    }

    @Bean
    public Student studentJil() {
        var student = new Student();
        student.setName("Jil");
        student.setMapOfSubjectGrades(
                new HashMap<>(
                        Map.of(
                                "Math", 5,
                                "Language", 1,
                                "IT", 1)));

        return student;
    }
}
