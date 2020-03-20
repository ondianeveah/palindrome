package scannerDemo;

import java.util.Scanner;

public class Palindrome {
    public static void Palindrome(String[] args) {
        String original, reverse = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 5 digits.");
        original = sc.nextLine();
        int length = original.length();

        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
            

        }
        if (original.equals(reverse)) {
            System.out.println("Palindrome.");
        } else {
            System.out.println("Try again");
            Palindrome(args);
        }
    }

    public static void main(String[] args) {
        Palindrome(args);
    }
}