package main.Actions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Add {
    CredentialFactory credentialFactory = new CredentialFactory();
    //create an object of SingleObject
    private static Add instance = new Add();

    //make the constructor private so that this class cannot be
    //instantiated
    private Add() {
    }

    //Get the only object available
    public static Add getInstance() {
        return instance;
    }

    public void updatePasswords(HashMap<String, ArrayList<String>> passwords) {
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
