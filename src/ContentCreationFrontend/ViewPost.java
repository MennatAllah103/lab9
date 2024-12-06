/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ContentCreationFrontend;

/**
 *
 * @author yaras
 */
import ContentCreationBackend.FactoryContent;
import ContentCreationBackend.Post;
import ContentCreationBackend.PostDataBase;
import UserManagementBackend.User;
import UserManagementBackend.UserDataBase;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ViewPost extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public ViewPost() {
        initComponents();
        PostDataBase PDB = PostDataBase.getInstance();
        UserDataBase currentUserDb = UserDataBase.getDatabase();
        User currentUser = currentUserDb.getCurrentUser();// Get the logged-in User object

        if (currentUser == null) {
            JOptionPane.showMessageDialog(this, "No user is currently logged in.", "Message", JOptionPane.ERROR_MESSAGE);
            return; // Exit if no user is logged in
        }
        ArrayList<Post> userPosts = PDB.ViewUserPosts(currentUser.getUserId());
        // Clear the panel before adding posts
        jPanel1.removeAll();
        for (Post post : userPosts) {
            // Create a new JLabel for the image
            JLabel imageLabel = new JLabel();
            ImageIcon imageIcon = new ImageIcon(post.getImagePath());
            Image image = imageIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            ImageIcon scaledImage = new ImageIcon(image);
            imageLabel.setIcon(scaledImage);

            // Create a new JTextArea for the content of the post
            JTextArea textArea = new JTextArea(post.getContent());
            textArea.setEditable(false);
            textArea.setLineWrap(true);
            textArea.setWrapStyleWord(true);
            LocalDateTime timestamp = post.getTimestamp();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedDate = timestamp.format(formatter); // Format the date
            // Create a JLabel to display the date
            JLabel dateLabel = new JLabel("Posted on: " + formattedDate);
            //  JLabel dateLabel = new JLabel("Posted on: " + timestamp.toString());
            dateLabel.setFont(dateLabel.getFont().deriveFont(12f));
            // Create a new JPanel to hold each post's components
            JPanel postPanel = new JPanel();
            postPanel.setLayout(new javax.swing.BoxLayout(postPanel, javax.swing.BoxLayout.Y_AXIS));
            postPanel.add(imageLabel);
            postPanel.add(textArea);
            postPanel.add(dateLabel);
            jPanel1.add(postPanel);
        }
//            ImageIcon imageIcon = new ImageIcon(post.getImagePath());
//            jLabel1.setIcon(imageIcon);
//            jTextArea1.setText(post.getContent());
//        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User Posts");

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));
        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
