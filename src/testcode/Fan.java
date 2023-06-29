
package testcode;


import java.util.*;

import java.util.Scanner;

public class Fan {
    private String name;
    private double price;

    public Fan() {
        this.name = "";
        this.price = 0.0;
    }

    public Fan(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public String getName() {
        if (this.name.length() < 4) {
            return this.name;
        }
        return this.name.substring(0,4);
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.price + ", " + this.name;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter fan name: ");
        String name = scanner.nextLine();

        double price = 0.0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Enter fan price: ");
                price = Double.parseDouble(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid price.");
            }
        }

        Fan fan = new Fan(price, name);
        System.out.println("Fan name: " + fan.getName());
        System.out.println("Fan price: " + fan.getPrice());
        System.out.println("Fan info: " + fan.toString());
    }
}
