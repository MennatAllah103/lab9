/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ProfileManagmentFrontend;

import ProfileManagementBackend.ProfileManager;
import UserManagementBackend.UserDataBase;
import java.awt.Image;
import java.io.File;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class EditProfile extends javax.swing.JFrame {

    ProfileManager manager;

    /**
     * Creates new form Profile
     */
    public EditProfile() {
        initComponents();
        manager = new ProfileManager();
        String username = UserDataBase.getCurrentUser().getUsername();
        usernameLabel.setText(username);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        profilePhotoLabel = new javax.swing.JLabel();
        coverPhotoLabel = new javax.swing.JLabel();
        btnUploadProfilePhoto = new javax.swing.JButton();
        btnUploadCoverPhoto = new javax.swing.JButton();
        bioLabel = new javax.swing.JLabel();
        btnSaveProfile = new javax.swing.JButton();
        bioScrollPane = new javax.swing.JScrollPane();
        bioTextArea = new javax.swing.JTextArea();
        btnChangePassword = new javax.swing.JButton();
        usernameLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        profilePhotoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProfileManagmentFrontend/defaultProfilePhoto.jpeg"))); // NOI18N

        coverPhotoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProfileManagmentFrontend/defaultCoverPhoto.jpg"))); // NOI18N

        btnUploadProfilePhoto.setBackground(new java.awt.Color(255, 204, 255));
        btnUploadProfilePhoto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUploadProfilePhoto.setText("Upload Profile Photo");
        btnUploadProfilePhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadProfilePhotoActionPerformed(evt);
            }
        });

        btnUploadCoverPhoto.setBackground(new java.awt.Color(255, 204, 255));
        btnUploadCoverPhoto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUploadCoverPhoto.setText("Upload Cover Photo");
        btnUploadCoverPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadCoverPhotoActionPerformed(evt);
            }
        });

        bioLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bioLabel.setText("Bio");

        btnSaveProfile.setBackground(new java.awt.Color(255, 204, 255));
        btnSaveProfile.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSaveProfile.setText("Save");
        btnSaveProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveProfileActionPerformed(evt);
            }
        });

        bioTextArea.setColumns(20);
        bioTextArea.setRows(5);
        bioScrollPane.setViewportView(bioTextArea);

        btnChangePassword.setBackground(new java.awt.Color(255, 204, 255));
        btnChangePassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnChangePassword.setText("Change Password");
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bioScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(profilePhotoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(btnChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnUploadCoverPhoto)
                            .addComponent(coverPhotoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSaveProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btnUploadProfilePhoto)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(profilePhotoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUploadProfilePhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bioScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(96, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(coverPhotoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUploadCoverPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSaveProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUploadProfilePhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadProfilePhotoActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String filePath = file.getAbsolutePath();
            ImageIcon icon = new ImageIcon(new ImageIcon(filePath).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
            profilePhotoLabel.setIcon(icon);
            manager.updatePhoto(filePath, "profile");
            JOptionPane.showMessageDialog(this, "Profile photo updated successfully!");

        }

    }//GEN-LAST:event_btnUploadProfilePhotoActionPerformed

    private void btnSaveProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveProfileActionPerformed
        String bio = bioTextArea.getText();
        String oldBio = UserDataBase.getCurrentUser().getBio();
        if (bio.isEmpty() || bio.equals(oldBio)) {
            JOptionPane.showMessageDialog(this, "No changes detected to save.", "Info", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        manager.updateBio(bio);
        JOptionPane.showMessageDialog(this, "Profile updated successfully!");


    }//GEN-LAST:event_btnSaveProfileActionPerformed

    private void btnUploadCoverPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadCoverPhotoActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String filePath = file.getAbsolutePath();
            ImageIcon icon = new ImageIcon(new ImageIcon(filePath).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
            coverPhotoLabel.setIcon(icon);
            manager.updatePhoto(filePath, "cover");
            JOptionPane.showMessageDialog(this, "Cover photo updated successfully!");
            
        }
    }//GEN-LAST:event_btnUploadCoverPhotoActionPerformed

    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
        ChangePassword changePassword = new ChangePassword(manager);
        changePassword.setVisible(true);
    }//GEN-LAST:event_btnChangePasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bioLabel;
    private javax.swing.JScrollPane bioScrollPane;
    private javax.swing.JTextArea bioTextArea;
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JButton btnSaveProfile;
    private javax.swing.JButton btnUploadCoverPhoto;
    private javax.swing.JButton btnUploadProfilePhoto;
    private javax.swing.JLabel coverPhotoLabel;
    private javax.swing.JLabel profilePhotoLabel;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
