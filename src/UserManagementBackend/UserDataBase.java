/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserManagementBackend;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/**
 *
 * @author LENOVO
 */
public class UserDataBase {

    public UserDataBase() {
        
                         }
    
    public static void SaveUserToFile(ArrayList<User> user)
    {
    JSONArray usersArray = new JSONArray();
        for (User u : user) {
            JSONObject j = new JSONObject();
            j.put("userId", u.getUserId());
            j.put("email", u.getEmail());
            j.put("dateOfBirth", u.getDateOfBirth());
            j.put("password", u.getPassword());
            j.put("username",u.getUsername());
            j.put("status", u.getStatus());
            usersArray.put(j);
        }
        try {
            FileWriter file = new FileWriter("users.json");
            file.write(usersArray.toString(4));
            file.close();
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
     public static ArrayList<User> ReadUserFromFile(){
       ArrayList<User> user=new ArrayList<>(); 
      try {
            String json = new String(Files.readAllBytes(Paths.get("users.json")));
            JSONArray usersArray = new JSONArray(json);
            DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;
            for (int i = 0; i < usersArray.length(); i++) {
                JSONObject userJson = usersArray.getJSONObject(i);
                String email = userJson.getString("email");
                String id = userJson.getString("userId");
                LocalDate date = LocalDate.parse(userJson.getString("dateOfBirth"), formatter);
                String password = userJson.getString("password");
                String username=userJson.getString("username");
                boolean status=userJson.getBoolean("status");
                user.add(new User(id, email, date, password,status,username));
            }

        } catch (IOException e) {
            System.err.println("Error reading users from file: " + e.getMessage());
        } catch (JSONException e) {
            System.err.println("Error parsing JSON data: " + e.getMessage());
        }
       return user;  
       }
       
       
       
       
       
       
       
       
      
     }
     
     
     
     
     
    

    
    
    

