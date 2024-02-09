package ru.fixedfox.model.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component("teacher")
public class Teacher {

    private final double lowestAverageGrade = 3.0;

    private List<Student> students;

    @Autowired
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @PostConstruct
    public void init() {
        System.out.print("Вступительный экзамен!\nСписок:\n");
        for (Student student : students) {

            student.setEnrolled( student.getAverageGrade() >= lowestAverageGrade);

            if (student.isEnrolled()) {
                System.out.println(student.getName()+ " - зачислен!");
            } else {
                System.out.println(student.getName() + " - НЕ зачислен!");
            }
        }
    }
}
