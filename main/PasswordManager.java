package main;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Scanner;

public class PasswordManager {
    public static void main(String[] args) {
        HashMap<String, Array> Passwords = new HashMap<>();
        System.out.println("Welcome to The Password Manager");
        System.out.println("Select an action:");
        System.out.println("1. Add a password");
        System.out.println("2. Update");
        System.out.println("3. Delete");
        System.out.println("4. Search");
        System.out.println("5. View a password");

        String output;
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        switch (input) {
            case 1:  output = "Add script and method call go here";
                break;
            case 2:  output = "Update script and method call go here";
                break;
            case 3:  output = "Delete script and method call go here";
                break;
            case 4:  output = "Search script and method call go here";
                break;
            case 5:  output = "View script and method call go here";
                break;
            default: output = "Invalid option";
                break;
        }

        System.out.println(output);
    }
}
