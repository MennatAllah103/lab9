/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frontend;

import ContentCreationFrontend.AddPostFront;
import ContentCreationFrontend.AddStoryFront;
import FriendManagementBackend.Management;
import ProfileManagmentFrontend.ViewProfile;
import UserManagementBackend.User;
import UserManagementBackend.UserDataBase;
import UserManagementBackend.UserLog;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Newsfeed extends javax.swing.JFrame {
     ViewProfile profile;
     UserDataBase database =UserDataBase.getDatabase();
     User user =UserDataBase.getCurrentUser();
     UserLog log=new UserLog(UserDataBase.getDatabase());
     Home home=Home.getInstance();
     Management manage = new Management();
    public Newsfeed() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVisitProfile = new javax.swing.JButton();
        ManageFriends = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        newsfeedLabel = new javax.swing.JLabel();
        addstory = new javax.swing.JButton();
        addPost = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Newsfeed");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        btnVisitProfile.setBackground(new java.awt.Color(255, 204, 255));
        btnVisitProfile.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVisitProfile.setText("Visit Profile");
        btnVisitProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisitProfileActionPerformed(evt);
            }
        });

        ManageFriends.setBackground(new java.awt.Color(255, 204, 255));
        ManageFriends.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ManageFriends.setText("Manage Friends");
        ManageFriends.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageFriendsActionPerformed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(255, 204, 255));
        logout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        newsfeedLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        newsfeedLabel.setText("Newsfeed");

        addstory.setBackground(new java.awt.Color(255, 204, 255));
        addstory.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addstory.setText("Add Story");
        addstory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addstoryActionPerformed(evt);
            }
        });

        addPost.setBackground(new java.awt.Color(255, 204, 255));
        addPost.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addPost.setText("Add Post");
        addPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPostActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ManageFriends)
                    .addComponent(newsfeedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(addPost)
                .addGap(37, 37, 37)
                .addComponent(addstory)
                .addGap(36, 36, 36)
                .addComponent(btnVisitProfile)
                .addGap(39, 39, 39)
                .addComponent(logout)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(newsfeedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ManageFriends)
                    .addComponent(btnVisitProfile)
                    .addComponent(logout)
                    .addComponent(addstory)
                    .addComponent(addPost))
                .addContainerGap(321, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVisitProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisitProfileActionPerformed
        
        ViewProfile p = new ViewProfile(this, manage);
        p.setVisible(true);
    }//GEN-LAST:event_btnVisitProfileActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed

        log.logOut(user);
        JOptionPane.showMessageDialog(this, "Logging out and returning to home");
        home.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_logoutActionPerformed

    private void addstoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addstoryActionPerformed
     
        AddStoryFront story=new AddStoryFront(this);
        story.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_addstoryActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        home.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void addPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPostActionPerformed

        AddPostFront post=new AddPostFront(this);
        post.setVisible(true);
        this.setVisible(false);
        
        
    }//GEN-LAST:event_addPostActionPerformed

    private void ManageFriendsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageFriendsActionPerformed
        // TODO add your handling code here:
        ManageFriends manager = new ManageFriends(this, user, manage);
        manager.setVisible(true);
        this.dispose();
        home.setVisible(false);
        
        
    }//GEN-LAST:event_ManageFriendsActionPerformed

  
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ManageFriends;
    private javax.swing.JButton addPost;
    private javax.swing.JButton addstory;
    private javax.swing.JButton btnVisitProfile;
    private javax.swing.JButton logout;
    private javax.swing.JLabel newsfeedLabel;
    // End of variables declaration//GEN-END:variables
}
