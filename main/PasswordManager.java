package main;

import main.Actions.ViewAll;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PasswordManager {
    public static void main(String[] args) {
        // Set mock data
        CredentialFactory credentialFactory = new CredentialFactory();
        HashMap<String, ArrayList<String>> passwords = new HashMap<>();
        passwords.put(new String("google.com"), new ArrayList<>(Arrays.asList("soduche", "password123456")));
        passwords.put(new String("yahoo.com"), new ArrayList<>(Arrays.asList("gigglefairy123", "password123456")));
        passwords.put(new String("yelp.com"), new ArrayList<>(Arrays.asList("redRaider", "password123456")));
        passwords.put(new String("facebook.com"), new ArrayList<>(Arrays.asList("username321", "password123456")));
        passwords.put(new String("raiderlink.ttu.edu"), new ArrayList<>(Arrays.asList("notpassword123", "password123456")));
        passwords.put(new String("google.com"), new ArrayList<>(Arrays.asList("help123", "password123456")));



        //Begin Loop
        int loopEnd = 1;
        do {
            // Main Menu Prompt
            System.out.println("Welcome to The Password Manager");
            System.out.println("Select an action:");
            System.out.println("1. Add a password");
            System.out.println("2. Update");
            System.out.println("3. Delete");
            System.out.println("4. Search");
            System.out.println("5. View All");
            System.out.println("6. Exit");

            Scanner scan = new Scanner(System.in);
            int input = scan.nextInt();
            switch (input) {
                // Add Method
                case 1: {
                    // call method to add inputs to HashMap
                    AddEntry(passwords);
                    System.out.println("Credentials added!");
                    System.out.println("Return to Main Menu(y) or Exit(n)");
                    Scanner sc = new Scanner(System.in);
                    String back = sc.next();

                    if (back.toLowerCase().equals("y")) {
                        break;
                    } else if (back.toLowerCase().equals("n")) {
                        loopEnd = 0;
                    }
                    break;
                }

                // Update Method
                case 2: {
                    System.out.println("Enter website (Ex. google.com): ");
                    update(passwords);
                    System.out.println("Return to Main Menu(y) | Exit(n)");
                    Scanner sc = new Scanner(System.in);
                    String back = sc.next();

                    if (back.toLowerCase().equals("y")) {
                        break;
                    } else if (back.toLowerCase().equals("n")) {
                        loopEnd = 0;
                    }
                    break;
                }

                // Delete Method
                case 3: {
                    System.out.println("Enter website (Ex. google.com): ");
                    delete(passwords);

                    System.out.println("Return to Main Menu(y) | Exit(n)");
                    Scanner sc = new Scanner(System.in);
                    String back = sc.next();

                    if (back.toLowerCase().equals("y")) {
                        break;
                    } else if (back.toLowerCase().equals("n")) {
                        loopEnd = 0;
                    }
                    break;
                }

                //Search Method
                case 4: {
                    if (passwords.isEmpty()) {
                        System.out.println("Your password manager entry list is currently empty\nConsider adding entries by selecting the 1st option in the home menu.");
                        System.out.println("...\n");
                        try {
                            Thread.sleep(1500);
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    } else {
                        search(passwords);
                        System.out.println("Return to Main Menu(y) | Exit(n)");
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

                //View all method
                case 5: {
                    ViewAll object = ViewAll.getInstance();
                    object.showPasswords(passwords);
                    System.out.println("Return to Main Menu(y) | Exit(n)");
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
        // End Loop
        while (loopEnd != 0);
    }

    static void getPasswords(HashMap<String, ArrayList<String>> passwords) {

    }

    public static void search(HashMap<String, ArrayList<String>> pword) {
        System.out.println("Enter the name of the site you are looking the credentials of");
        Scanner sc = new Scanner(System.in);
        String site = sc.nextLine().toLowerCase();
        if (!pword.containsKey(site)) {
            System.out.println("There is no entry for " + site);
        } else {
            System.out.println(site);
            System.out.println("Username: " + pword.get(site).get(0));
            System.out.println("Password: " + pword.get(site).get(1));
        }
        System.out.println("...\n");
        try {
            Thread.sleep(1500);
        } catch (Exception e) {
            System.out.println(e);
        }
        //sc.close();
    }

    //delete method
    public static void delete(HashMap<String, ArrayList<String>> passwords) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();

        if (passwords.containsKey(input)) {
            passwords.remove(input);
            System.out.println(input + " has been removed!");
        } else {
            System.out.println("The website input could not be found or does not exist");

        }

    }

    //Asks the user for a website then updates the credentials
    public static void update(HashMap<String, ArrayList<String>> pword) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine().toLowerCase();

        //if the key is not found print an error message and return
        if (!(pword.containsKey(input))) {
            System.out.println("There are no credentials for this website.");
        } else {
            System.out.println("Website:" + input);
            System.out.println("Current Username:" + pword.get(input).get(0));
            System.out.println("Current Password:" + pword.get(input).get(1) + "\n");

            System.out.println("New Username> ");
            String input_user = scan.nextLine();

            System.out.println("New Password> ");
            String input_pass = scan.nextLine();

            ArrayList<String> credentials = new ArrayList<>(Arrays.asList(input_user, input_pass));

            pword.replace(input, credentials);
            System.out.println("Credentials changed");
        }
    }

    public static void AddEntry(HashMap<String, ArrayList<String>> passwords) {
        // Use scanner to take input
        System.out.println("Enter website (Ex. google.com): ");
        Scanner sc1 = new Scanner(System.in);
        String web = sc1.next();
        // Use scanner to take input
        System.out.println("Enter username: ");
        Scanner sc2 = new Scanner(System.in);
        String usnm = sc2.next();
        // Use scanner to take input
        System.out.println("Enter password: ");
        Scanner sc3 = new Scanner(System.in);
        String pass = sc3.next();
        Credential credential = CredentialFactory.createCredential(web, usnm, pass);
        passwords.put(credential.getWebsite(), credential.getCredentials());
    }
}

