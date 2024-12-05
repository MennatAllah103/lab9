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
    ArrayList<Friends> friendsarray=FriendsDB.getALLFriends();
    
    
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
    
    //suggest friends who are not already in the user's friend list.
    
    public ArrayList<Friends> getUserFriends(String Userid1)
    {
        ArrayList<Friends> userfriends = new ArrayList<Friends>();
        
        for(Friends f : friendsarray)
        {
            if(Userid1.equals(f.getUserid1())||Userid1.equals(f.getUserid2()))
                   userfriends.add(f);
            
        }
        return userfriends ;
    }

    }

