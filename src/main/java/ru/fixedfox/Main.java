package ru.fixedfox;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.fixedfox.data.Teacher;

public class Main {
    public static void main(String[] args) {
        var javaConfigContext = new AnnotationConfigApplicationContext(ContextConfig.class);
        Teacher teacherJoe = (Teacher) javaConfigContext.getBean("teacherBean");
        System.out.println("");
    }
}