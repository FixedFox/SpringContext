package ru.fixedfox.model.data;

import java.util.Map;

public class Student {
    private String name;
    private Map<String, Integer> mapOfSubjectGrades;
    private boolean enrolled = false;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setMapOfSubjectGrades(Map<String, Integer> mapOfSubjectGrades) {
        this.mapOfSubjectGrades = mapOfSubjectGrades;
    }

    public Map<String, Integer> getMapOfSubjectGrades() {
        return mapOfSubjectGrades;
    }

    public void setEnrolled(boolean enrolled) {
        this.enrolled = enrolled;
    }

    public boolean isEnrolled() {
        return enrolled;
    }

    public double getAverageGrade() {
        return mapOfSubjectGrades.values()
                .stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
    }
}
