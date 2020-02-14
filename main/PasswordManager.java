package main;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class PasswordManager {

    // Asks for site name and iterates through hashmap and matches with key, then displays value of matched key
    public static void search(HashMap<String, String[]> pword){
        System.out.println(pword.keySet());
        System.out.println("Enter the name of the site you are looking the credentials of");
        Scanner sc = new Scanner(System.in);
        String site = sc.nextLine().toLowerCase();
        if(Arrays.toString(pword.get(site)).equals("null")){
            System.out.println("There is no entry for "+site);
        }
        else{
            System.out.println("Your credentials for "+site+" are : "+Arrays.toString(pword.get(site)));
        }
        System.out.println("...\n");
        try {
            Thread.sleep(1500);
        } catch (Exception e) {
            System.out.println(e);
        }
        //sc.close();
    }



    public static void main(String[] args) {
        HashMap<String, String[]> Passwords = new HashMap<>();
        //Parameter "String" has the website, and String[] created below has username at index[0] and password at index[1]
        String[] credentials1=new String[2];
        int loopEnd=1;
        do{
            System.out.println("Welcome to The Password Manager");
            System.out.println("Select an action:");
            System.out.println("1. Add a password");
            System.out.println("2. Update");
            System.out.println("3. Delete");
            System.out.println("4. Search");
            System.out.println("5. View a password");
            System.out.println("6. Exit program");


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
                    if (Passwords.isEmpty()){
                        System.out.println("Your password manager entry list is currently empty\nConsider adding entries by selecting the 1st option in the home menu.");
                        System.out.println("...\n");
                        try {
                            Thread.sleep(1500);
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    }
                    else{
                        search(Passwords);
                    }
                    break;
                case 5:  output = "View script and method call go here";
                    break;
                case 6:  output = "Exiting code";
                loopEnd=0;
                    break;
                default: output = "Invalid option";
                    break;
            }
            System.out.println(output);
        }while (loopEnd!=0);
    }
}
