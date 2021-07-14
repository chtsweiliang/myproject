package com.cht;

import java.util.Scanner;

public class ForTester {
    public static void main(String[] args) {
        String data = String.valueOf(123);
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many slices?");
        String s = scanner.next();
        try {
            int n = Integer.parseInt(s);
            System.out.println(8 / n);
        } catch (ArithmeticException e) {
            System.out.println("不切，謝謝!");
        } catch (NumberFormatException e) {
            System.out.println("資料有誤!");
        }
        System.out.println("Cutting pizza");

        int row = 15;
        int col = 30;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if ((i == j && i >= row / 2) || j == col - 1 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
//        drawAnX();

    }

    private static void drawAnX() {
        int row = 10;
        int col = 10;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j || j == col - 1 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
