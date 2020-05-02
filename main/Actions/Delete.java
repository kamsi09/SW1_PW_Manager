package main.Actions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Delete {
    //create an object of SingleObject
    private static Delete instance = new Delete();

    //make the constructor private so that this class cannot be instantiated

    private Delete() {
    }

    //Get the only object available
    public static Delete getInstance() {

        return instance;
    }

    // make delete passwords method
    public void deletePasswords(HashMap<String, ArrayList<String>> passwords) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();

        if (passwords.containsKey(input)) {
            passwords.remove(input);
            System.out.println(input + " has been removed!");
        } else {
            System.out.println("The website input could not be found or does not exist");

        }
    }
}