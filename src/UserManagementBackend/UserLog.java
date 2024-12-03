/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserManagementBackend;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author daree
 */
public class UserLog {

    User user;
    UserDataBase database;

    public UserLog(UserDataBase database) {
        // this.user = user;
        this.database = database;
    }

    public boolean signup(String email, String password, LocalDate dateOfBirth, String Username) {

        User user = new User(email, dateOfBirth, password, Username);
        boolean AddUser = database.AddUser(user);
        if (AddUser) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValidEmail(String email) {
        // Check if the email is null
        if (email == null) {
            // System.out.println("Email is NULL. Please provide a valid email.");
            return false;  // Invalid if the email is null
        }

        int length = email.length();
        int atSymbolIndex = -1;
        int dotIndex = -1;

        // Find the index of the '@' symbol
        for (int i = 0; i < length; i++) {
            if (email.charAt(i) == '@') {
                atSymbolIndex = i;
                break;
            }
        }

        // Check if the '@' symbol is present
        if (atSymbolIndex == -1) {
           // System.out.println("Invalid email. The email must contain the '@' symbol.");
            return false;
        }

        // Check if there is at least one character before and after '@'
        if (atSymbolIndex <= 0 || atSymbolIndex >= length - 1) {
            //System.out.println("Invalid email. The '@' symbol should have at least one character before and after it.");
            return false;
        }

        // Find the index of the '.' symbol after '@'
        for (int i = atSymbolIndex + 1; i < length; i++) {
            if (email.charAt(i) == '.') {
                dotIndex = i;
                break;
            }
        }

        // Check if the dot is directly after the '@' symbol
        if (dotIndex == atSymbolIndex + 1) {
           // System.out.println("Invalid email. The '.' cannot be directly after the '@' symbol.");
            return false;
        }

        // Check for a valid domain (at least one '.' after '@')
        if (dotIndex == -1 || dotIndex >= length - 1) {
           // System.out.println("Invalid email. The domain should have at least one character after '.'");
            return false;
        }

        return true;  // Valid email
    }

}
