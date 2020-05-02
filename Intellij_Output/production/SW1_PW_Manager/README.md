# SW1_PW_Manager
1 ) GitHub Link : https://github.com/kamsi09/SW1_PW_Manager
2 ) Goal of the project : Create an android app that serves as a password manager. It would allow the user to store both username and passwords of any website in a database, so that they can retrieve their credentials.
2) Anybody with online accounts on any website. Users should ideally ensure their online security and privacy by using robust, unique passwords for every website. Using a password manager would encourage users to do just that, since they wouldn’t have to remember their credentials.
3) Implemented functionalities (uses cases):
•	Add entry
•	Remove entry
•	Change entry
•	Search for an entry
•	Generate or View ?
Add entry (Implemented by Dabion Couch)
The Add Entry Method is to allow for the user to amend another website to which they would like their username and password stored in the database. In the case that the user selects option number 2 the program will call this method which prompts the user for the desired website/app, username and password. The method only takes the HashMap as the parameter and returns nothing. The new entry is stored into the HashMap. The code is fairly simple as it scans in the user input and stores the data. After the process is complete the program allows for the user to go back to the main menu to complete another use case
Remove or Delete (Implemented by Rider Jefferies)
This method is designed to allow the user, who has already has input information into the database, to select and remove one of the profiles. In the case that the user selects the third case(delete) the program will then ask the user to input the name of the website related to the stored information that they would like to delete. The program then finds the key equal to the input and removes the section from the HashMap. If, however, the input website does not match any key in the database the method will output a message informing the user of the absence and return the user to the main menu.
Change entry (Implemented by Grant Henderson) 

The change entry method lets the user change the credentials of a website in the database. The user inputs the website they want to change the credentials of. If there are existing credentials the user may change the username and password, otherwise the method will state that the user has no credentials for the specified website. If the credentials are changed successfully a message will be printed to state the success then the user will be returned to the main menu. 

Search for an entry (Implemented by Ismael Abou Coulibaly):
This method allows the user to look for a specific website in the database. The user is asked for an input, types the name of the site and the method outputs the username and password associated with said website. If the database is empty, the method outputs a message letting the user know and sends him back to the main menu. If the input does not match any entry in the database, a message is printed accordingly, and the methods loops back to the main menu.
Generate or View  (Implemented by Sam Oduche)
Description: Allows user to view all passwords that are currently stored in list form. This use case begins when the user selects from the main menu indicating that the user would like to view all passwords. The system then sends the request to be verified and if there are no passwords then it will return that there are no passwords saved yet. If there are passwords then the system retrieves all passwords and then will show a list of all the websites, usernames and passwords stored in the system.

Actors:
• User with an account
• Password Management system
Triggers:
• The user wants to view existing passwords in password manager
Preconditions:
• The system is operational
• The user has successfully launched the application
Post conditions:
• The user has received a list of all websites, usernames and passwords
Normal flow:
1. The user logs into the password manager
2. The system verifies the login credentials are valid
3. The user enters the main menu
4. The user selects the option to view all passwords
5. The system retrieves all passwords
6. The system displays all passwords

