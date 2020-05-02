package main.Actions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Search {
    //create an object of SingleObject
    private static Search instance = new Search();

    //make the constructor private so that this class cannot be
    //instantiated
    private Search(){}

    //Get the only object available
    public static Search getInstance(){
        return instance;
    }

    public void searchPasswords(HashMap<String, ArrayList<String>> passwords) {
        System.out.println("Enter the name of the site you are looking the credentials of");
        Scanner sc = new Scanner(System.in);
        String site = sc.nextLine().toLowerCase();
        if (!passwords.containsKey(site)) {
            System.out.println("There is no entry for " + site);
        } else {
            System.out.println(site);
            System.out.println("Username: " + passwords.get(site).get(0));
            System.out.println("Password: " + passwords.get(site).get(1));
        }
        System.out.println("...\n");
        try {
            Thread.sleep(1500);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
