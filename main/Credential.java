package main;

import java.util.ArrayList;


public class Credential {
    private String website;
    private String username;
    private String password;
    
    public Credential()
    {
        website = "website.com";
        username = "username";
        password = "password";
    }
    public Credential(String website, String username, String password)
    {
        this.website = website;
        this.username = username;
        this.password = password;
    }
    public String getWebsite()
    {
        return this.website;
    }
    public ArrayList<String> getCredentials()
    {
        ArrayList<String> credentials = new ArrayList<String>();
        credentials.add(this.username);
        credentials.add(this.password);
        return credentials;
    }
    
    
    
}
