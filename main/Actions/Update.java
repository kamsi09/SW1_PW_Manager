package main.Actions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Update {
    //create an object of SingleObject
    private static Update instance = new Update();

    //make the constructor private so that this class cannot be
    //instantiated
    private Update() {
    }

    //Get the only object available
    public static Update getInstance() {
        return instance;
    }

    public void updatePasswords(HashMap<String, ArrayList<String>> passwords) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().toLowerCase();

        //if the key is not found print an error message and return
        if (!(passwords.containsKey(input))) {
            System.out.println("There are no credentials for this website.");
        } else {
            System.out.println("Website:" + input);
            System.out.println("Current Username:" + passwords.get(input).get(0));
            System.out.println("Current Password:" + passwords.get(input).get(1) + "\n");

            System.out.println("New Username> ");
            String input_user = scan.nextLine();

            System.out.println("New Password> ");
            String input_pass = scan.nextLine();

            ArrayList<String> credentials = new ArrayList<>(Arrays.asList(input_user, input_pass));

            passwords.replace(input, credentials);
            System.out.println("Credentials changed");
        }
    }
}
