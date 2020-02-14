package main;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PasswordManager {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> passwords = new HashMap<>();
        passwords.put(new String("google.com"), new ArrayList<>(Arrays.asList("soduche", "password123456")));
        passwords.put(new String("yahoo.com"), new ArrayList<>(Arrays.asList("gigglefairy123", "password123456")));
        passwords.put(new String("yelp.com"), new ArrayList<>(Arrays.asList("redRaier", "password123456")));
        passwords.put(new String("facebook.com"), new ArrayList<>(Arrays.asList("username321", "password123456")));
        passwords.put(new String("raiderlink.ttu.edu"), new ArrayList<>(Arrays.asList("notpassword123", "password123456")));
        passwords.put(new String("google.com"), new ArrayList<>(Arrays.asList("help123", "password123456")));

        int loopEnd=1;


        do {
            System.out.println("Welcome to The Password Manager");
            System.out.println("Select an action:");
            System.out.println("1. Add a password");
            System.out.println("2. Update");
            System.out.println("3. Delete");
            System.out.println("4. Search");
            System.out.println("5. View all passwords");
            Scanner scan = new Scanner(System.in);
            int input = scan.nextInt();
            switch (input) {
                case 1: {
                    // Use scanner to take input
                    System.out.println("Enter website (Ex. google.com): ");
                    // Use scanner to take input
                    System.out.println("Enter username: ");
                    // Use scanner to take input
                    System.out.println("Enter username: ");
                    // call method to add inputs to HashMap
                    break;
                }

                case 2: {
                    System.out.println("Update script and method call go here");
                    break;
                }
                case 3: {
                    System.out.println("Delete script and method call go here");
                    break;
                }
                case 4: {
                    if (passwords.isEmpty()){
                        System.out.println("Your password manager entry list is currently empty\nConsider adding entries by selecting the 1st option in the home menu.");
                        System.out.println("...\n");
                        try {
                            Thread.sleep(1500);
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    }
                    else{
                        search(passwords);
                        System.out.println("Return to Main Menu(y) or Exit(n)");
                        Scanner sc = new Scanner(System.in);
                        String back = sc.next();

                        if (back.toLowerCase().equals("y")) {
                            break;
                        } else if (back.toLowerCase().equals("n")) {
                            loopEnd = 0;
                        }
                    }
                    break;
                }
                case 5: {
                    getAllPasswords(passwords);
                    System.out.println("Return to Main Menu(y) or Exit(n)");
                    Scanner sc = new Scanner(System.in);
                    String back = sc.next();

                    if (back.toLowerCase().equals("y")) {
                        break;
                    } else if (back.toLowerCase().equals("n")) {
                        loopEnd = 0;
                    }


                }
                case 6: {
                    loopEnd = 0;
                    break;
                }
                default: {
                    System.out.println("Invalid option");
                    break;
                }

            }

        }
        while (loopEnd!=0);
    }

    static void getAllPasswords(HashMap<String, ArrayList<String>> passwords){
        for (String s : passwords.keySet()){
            System.out.println("Website: " + s);
            System.out.println("Username: " + passwords.get(s).get(0));
            System.out.println("Password: " + passwords.get(s).get(1));
            System.out.println("-----------------------------------------------");
        }
    }

    public static void search(HashMap<String, ArrayList<String>> pword){
        System.out.println("Enter the name of the site you are looking the credentials of");
        Scanner sc = new Scanner(System.in);
        String site = sc.nextLine().toLowerCase();
        if(!pword.containsKey(site)){
            System.out.println("There is no entry for " + site);
        }
        else{
            System.out.println("Your credentials for "+site+" are : "+pword.get(site));
        }
        System.out.println("...\n");
        try {
            Thread.sleep(1500);
        } catch (Exception e) {
            System.out.println(e);
        }
        //sc.close();
    }
}
