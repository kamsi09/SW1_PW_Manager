package main.Actions;

public class CredentialFactory{
    
    static Credential createCredential(String website, String username, String password)
    {
         Credential credential = new Credential(website,username, password);
         return credential;
    }
    
}
