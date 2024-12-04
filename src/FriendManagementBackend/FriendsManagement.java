/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FriendManagementBackend;

import java.util.ArrayList;

/**
 *
 * @author daree
 */
public class FriendsManagement {
    
    FriendsDatabase FriendsDB =FriendsDatabase.getinstance();
    ArrayList<Friends> friendsarray=FriendsDB.getFriends();
    
    
    public void addfriend(Friends F)
    {
        friendsarray.add(F);
       FriendsDB.saveFile(friendsarray);
    }
    
    public void removefriend(Friends F)
    {
        friendsarray.remove(F);
       FriendsDB.saveFile(friendsarray);
    }
    
    
}
