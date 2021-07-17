package com.cht;

import java.io.*;

public class Scoring {
    public static void main(String[] args) {

        String[] names = new String[4];
        int[] maths = new int[4];
        int[] englishs = new int[4];
        try {
            FileReader fileReader = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(fileReader);
            String line = br.readLine();
            int i = 0;
            while (line != null) {
//                Eric 90 70
//                System.out.println(line);
                String[] tokens = line.split(" ");
                names[i] = tokens[0];
                maths[i] = Integer.parseInt(tokens[1]);
                englishs[i] = Integer.parseInt(tokens[2]);
                int average = (englishs[i] + maths[i]) / 2;
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


                System.out.println(names[i] + " " + englishs[i] + " " + maths[i] + " " + average + " " + grading);

                line = br.readLine();
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
