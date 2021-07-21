package com.cht;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Scoring {
        public static void main(String[] args) {
            List<Student> students = new ArrayList<>();
            try {
                FileReader fileReader = new FileReader("data.txt");
                BufferedReader br = new BufferedReader(fileReader);
                String line = br.readLine();
                int i = 0;
                while(line != null) {
                    //Eric 90 70
//                System.out.println(line);
                    String[] tokens = line.split(" ");
                    Student stu = new Student(tokens[0],
                            Integer.parseInt(tokens[1]),
                            Integer.parseInt(tokens[2]));
                    System.out.println(stu.name + " " + stu.english + " " + stu.math + " "
                            + stu.getAverage() + " " + stu.getGrading());
                    students.add(stu);
                    line = br.readLine();
//                    i++;
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
