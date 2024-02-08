package ru.fixedfox;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import ru.fixedfox.data.Student;

@Component
public class JilGradeUpBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Student) {
            if (((Student) bean).name.equals("Jil")) {
                while ((((Student) bean).getAverageGrade() < 3.0F)) {
                    for (String subject : ((Student) bean).mapOfSubjectGrades.keySet()) {
                        if (((Student) bean).mapOfSubjectGrades.get(subject) <=4) {
                            ((Student) bean).mapOfSubjectGrades
                                    .replace(subject,
                                            ((Student) bean).mapOfSubjectGrades.get(subject) + 1);
                        } else {
                            continue;
                        }
                        if ((((Student) bean).getAverageGrade() >= 3.0F)){
                            break;
                        }
                    }
                }
            }
        }
        return bean;
    }
}
