package com.cht;

public class Scoring {
    public static void main(String[] args) {
        int english = 90;
        int math = 10;
        String name = "Eric";
        int average = (english + math) / 2;
        String grading = "F";

        if (average >= 90) {
            grading = "A";
        } else if (average >= 80) {
            grading = "B";
        } else if (average >= 70) {
            grading = "C";
        } else if (average >= 60) {
            grading = "D";
        }


        System.out.println(name + " " + english + " " + math + " " + average+" "+grading);
    }
}
