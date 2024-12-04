/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserManagementBackend;

import java.time.LocalDate;
import java.util.UUID;

/**
 *
 * @author LENOVO
 */
public class User {

    private String userId;
    private String email;
    private LocalDate dateOfBirth;
    private String password;
    private boolean status;
    private String username;
    private String profilePhoto;
    private String coverPhoto;
    private String bio;

    public User(String email, LocalDate dateOfBirth, String password, String username) {
        this.userId=UUID.randomUUID().toString();
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.password = password;
        this.status=status;
        this.username=username;
        this.profilePhoto = "defaultProfilePhoto.jpg";
        this.coverPhoto = "defaultCoverPhoto.jpg";
        this.bio = "";
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
 
    public String getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public String getCoverPhoto() {
        return coverPhoto;
    }
   
    public void setCoverPhoto(String coverPhoto) {
        this.coverPhoto = coverPhoto;
    }
 
    public String getBio() {
        return bio;
    }
 
    public void setBio(String bio) {
        this.bio = bio;
    }
    
}
