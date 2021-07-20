package com.cht;

import java.util.Scanner;

public class ForTester {
    public static void main(String[] args) {

        int row = 15; // 幾列?
        int col = 30; // 幾欄?

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
        drawAnX();
        System.out.println();
        drawAnSquare();
        System.out.println();
        drawAnRightTriangle1();
        System.out.println();
        drawAnRightTriangle2();

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

    private static void drawAnSquare() {
        int row = 10;
        int col = 10;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void drawAnRightTriangle1() {
        int row = 10;
        int col = 10;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i > j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }

    private static void drawAnRightTriangle2() {
        int row = 10;
        int col = 10;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
