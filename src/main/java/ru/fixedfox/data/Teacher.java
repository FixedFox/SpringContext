package ru.fixedfox.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component("teacherBean")
public class Teacher {

    @Autowired
    private List<Student> students;

    @PostConstruct
    public void init() {

        System.out.print("Вступительный экзамен!\nСписок:\n");

        for (Student student : students) {
            if (student.enrolled)
            {
                System.out.println(student.name + " - зачислен!");
            } else {
                System.out.println(student.name + " - НЕ зачислен!");
            }
        }
    }
}