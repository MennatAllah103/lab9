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
public class RequestsManagement {
    
   RequestsDatabase RequestsDB= RequestsDatabase.getinstance();
  ArrayList<Requests> requestsarray=RequestsDB.getALLRequests();
  
 // FriendsDatabase FriendsDB =FriendsDatabase.getinstance();
  //3ade a3ml new hna wla la2
  FriendsManagement FriendsM= new FriendsManagement();
    
    public void addrequest(Requests R)
    {
        requestsarray.add(R);
        RequestsDB.saveFile(requestsarray);
    }
    
    public void deleterequest(Requests R)
    {
        requestsarray.remove(R);
       RequestsDB.saveFile(requestsarray);
    }
    
    public void acceptrequest(Requests R)
    {
      String Userid1 = R.getSenderID();
      String Userid2 = R.getReceiverID();
      
      Friends friends= new Friends(Userid1,Userid2);
   
     
     FriendsM.addfriend(friends);
      
    }
    
    public void declinerequest(Requests R)
    {
          deleterequest(R);
    }
    
    
}
