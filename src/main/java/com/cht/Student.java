package com.cht;

public class Student {
    String name;
    int math;
    int english;

    public Student(String name, int math, int english) {
        this.name = name;
        this.math = math;
        this.english = english;
    }

    public int getAverage() {
        return (math + english) / 2;
    }

    public String getGrading() {
        String grading = "F";
        switch (getAverage() / 10) {
            case 10:
            case 9:
                grading = "A";
                break;
            case 8:
                grading = "B";
                break;
            case 7:
                grading = "C";
                break;
            case 6:
                grading = "D";
            default:
                break;
        }
//        int average = getAverage();
//        String grading = "F";
//        if (average >= 90) {
//            grading = "A";
//        } else if (average >= 80) {
//            grading = "B";
//        } else if (average >= 70) {
//            grading = "C";
//        } else if (average >= 60) {
//            grading = "D";
//        }
        return grading;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }
}
