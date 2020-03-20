package scannerDemo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        boolean n = false;
        boolean x = false;
        int attempts = 0;

        while(!x) {
            System.out.println("What is your name?");
            String name = userInput.nextLine();
            if (name.equalsIgnoreCase("alice")) {
                System.out.println("Welcome Alice");
                x = true;

            } else if (name.equalsIgnoreCase("bob")) {
                System.out.println("Welcome bob");
                x = true;
            } else {
                attempts++;
                System.out.println("Name is incorrect, try again!!" + "\n" + "This is your #" + attempts + " attempt.");
                n = false;
            }
        }
        }
    }







