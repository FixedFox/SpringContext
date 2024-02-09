package ru.fixedfox;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.fixedfox.model.contexts.ApplicationContext;
import ru.fixedfox.model.data.Teacher;

public class Main {
    public static void main(String[] args) {
        var javaConfigContext = new AnnotationConfigApplicationContext(ApplicationContext.class);
        var xmlConfigContext = new ClassPathXmlApplicationContext("XmlApplicationContext.xml");

        Teacher teacherJoe = (Teacher) javaConfigContext.getBean("teacher");
        Teacher teacherPhillip = (Teacher) xmlConfigContext.getBean("teacher");

        javaConfigContext.close();
        xmlConfigContext.close();
    }
}