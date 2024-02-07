package ru.fixedfox.data;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class Student {
    public String name;

    public Map<String,Integer> mapOfSubjectGrades;
    public boolean enrolled = false;
}
