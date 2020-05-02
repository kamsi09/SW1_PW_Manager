package main;

import main.Actions.*;

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
                    Add add = Add.getInstance();
                    add.updatePasswords(passwords);
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
                    Update update = Update.getInstance();
                    update.updatePasswords(passwords);
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
                    Delete delete = Delete.getInstance();
                    delete.deletePasswords(passwords);

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
                        Search search = Search.getInstance();
                        search.searchPasswords(passwords);
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
                    ViewAll viewAll = ViewAll.getInstance();
                    viewAll.showPasswords(passwords);
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

}

