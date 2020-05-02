package main.Actions;

import java.util.ArrayList;
import java.util.HashMap;

public class ViewAll {
    //create an object of SingleObject
    private static ViewAll instance = new ViewAll();

    //make the constructor private so that this class cannot be
    //instantiated
    private ViewAll(){}

    //Get the only object available
    public static ViewAll getInstance(){
        return instance;
    }

    public void showPasswords(HashMap<String, ArrayList<String>> passwords) {
        if (passwords.isEmpty()) {
            System.out.println("No Passwords Yet!");
        } else {
            for (String s : passwords.keySet()) {
                System.out.println("-----------------------------------------------");
                System.out.println("Website: " + s);
                System.out.println("Username: " + passwords.get(s).get(0));
                System.out.println("Password: " + passwords.get(s).get(1));
            }
        }
    }
}
