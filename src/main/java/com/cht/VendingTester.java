package com.cht;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingTester {

    public static void main(String[] args) {
        List<Drink> drinks = readDrinksFromFile();
        Scanner scanner = new Scanner(System.in);
        int n = -1;
        int total = 0;
        while(n != 0) {
            System.out.println("Please insert coin:");
            String s = scanner.next();
            switch (s) {
                case "1":
                case "5":
                case "10":
                    n = Integer.parseInt(s);
                    total = total + n;
                    break;
                default:
                    if (s.equals("0")) {
                        System.out.println("BEEP!");
                    } else {
                        //"c"
                        for (int i=0; i<drinks.size(); i++) {
                            Drink drink = drinks.get(i);
                            if (drink.id.equals(s)) {
                                int price = drink.price;
                                if (total < price) {
                                    System.out.println("BEEP!");
                                } else {
                                    System.out.println("Your choice: "+drink.name);
                                    total -= drink.price;
                                }
                            }
                        }
                    }
                    break;
            }
            System.out.println("Total: " + total);
            //escape
            for (int i=0; i<drinks.size(); i++) {
                System.out.println(drinks.get(i));
            }
        }
        System.out.println("End");
    }

    static List<Drink> readDrinksFromFile() {
        List<Drink> drinks = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("drinks.txt");
            BufferedReader br = new BufferedReader(fileReader);
            String line = br.readLine();
            int i = 0;
            while(line != null) {
                String[] tokens = line.split(",");
                Drink drink = new Drink(tokens[0],
                        tokens[1],
                        Integer.parseInt(tokens[2]));
                drinks.add(drink);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return drinks;
    }

    void printMenu() {

    }
}
