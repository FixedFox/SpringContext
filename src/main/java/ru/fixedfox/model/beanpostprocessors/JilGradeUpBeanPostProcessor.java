package ru.fixedfox.model.beanpostprocessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import ru.fixedfox.model.data.Student;

@Component
public class JilGradeUpBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Student) {
            Student student = (Student) bean;
            if (student.getName().equals("Jil")) {
                System.out.println("У Jil плохие оценки. Надо исправить.");
                student.getMapOfSubjectGrades().replaceAll((k, value) -> value = 5);
            }
        }
        return bean;
    }
}
