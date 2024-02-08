package ru.fixedfox.data;

import java.util.Map;

public class Student {
    public String name;

    public Map<String,Integer> mapOfSubjectGrades;
    public boolean enrolled = false;

    public float getAverageGrade(){
        return (float) mapOfSubjectGrades
                .values()
                .stream()
                .reduce(Integer::sum)
                .orElse(0) / mapOfSubjectGrades.size();
    }
}
