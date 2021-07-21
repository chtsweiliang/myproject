import com.cht.Drink;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingTester {

    public static void main(String[] args) {
        List<Drink> drinks = readDrinkFromFile();
        Scanner scanner = new Scanner(System.in);

        int n = -1;
        int total = 0;
        while (n != 0) {
            System.out.println("Please insert coin");
            String input = scanner.next();
            switch (input) {
                case "10":
                case "5":
                case "1":
                    total += Integer.parseInt(input);
                    System.out.println("You insert coin :" + total);
                    break;
                default:
                    if (input.equals("0")) {
                        System.out.println("Beep!");
                    } else {
                        for (int i = 0; i < drinks.size(); i++) {
                            Drink drink = drinks.get(i);
                            if (drink.id.equals(input)) {
                                int price = drink.price;
                                if (total < price) {
                                    System.out.println("Beep!");
                                } else {
                                    System.out.println("You Choose:" + drink.name);
                                    total -= drink.price;
                                }
                            }

                        }

                    }
                    break;
            }
            System.out.println("Total:" + total);
            for (int i = 0; i < drinks.size(); i++) {
                System.out.println(drinks.get(i));
            }
        }

        System.out.println("End!");
    }

    private static List<Drink> readDrinkFromFile() {
        List<Drink> drinks = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("drinks.txt");
            BufferedReader br = new BufferedReader(fileReader);
            String line = br.readLine();
            while (line != null) {
                String[] token = line.split(",");
                Drink drink = new Drink(token[0], token[1], Integer.parseInt(token[2]));
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
}
