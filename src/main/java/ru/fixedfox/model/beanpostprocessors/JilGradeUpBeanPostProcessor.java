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
            if (((Student) bean).getName().equals("Jil")) {
                System.out.println("У Jil плохие оценки. Надо исправить.");

                while (((Student) bean).getAverageGrade() < 3.0F) {
                    for (String subject : ((Student) bean).getMapOfSubjectGrades().keySet()) {
                        if (((Student) bean).getMapOfSubjectGrades().get(subject) <= 4) {
                            ((Student) bean).getMapOfSubjectGrades()
                                    .replace(subject,
                                            ((Student) bean).getMapOfSubjectGrades().get(subject) + 1);
                        } else {
                            continue;
                        }
                        if (((Student) bean).getAverageGrade() >= 3.0F) {
                            break;
                        }
                    }
                }
            }
        }
        return bean;
    }
}
