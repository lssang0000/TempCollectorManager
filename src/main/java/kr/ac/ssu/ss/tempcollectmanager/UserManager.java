/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kr.ac.ssu.ss.tempcollectmanager;

import java.util.ArrayList;

/**
 *
 * @author lssang
 */
public class UserManager {

    private ArrayList<User> users;
    
    public UserManager() {
        users = new ArrayList<User>();
        
        users.add(new User("1", "sanghwan"));
        users.add(new User("2", "jonghyuk"));
        
        //elasticsearch Userlist init code
    }
    
    public String[] getUserList(){
        int leng = users.size();
        String list[] = new String[leng];
                
        for(int i = 0 ; i < leng ; i++){
            User user = users.get(i);
            String item = user.getName()+"("+user.getId()+")";
            list[i] = item;
        }        
        return list;
    }
    
    public int addUser(String id, String name){
        int leng = users.size();
        
        for(int i = 0 ; i < leng ; i ++){
            String uId = users.get(i).getId();
            if(id.equals(uId)){
                return Constants.ALREADY_EXIST;
            }            
        }
        
        users.add(new User(id, name));
        
        //elasticsearch add code 
        
        return Constants.DONE;
    }
    
    public boolean containId(String id){
        int leng = users.size();
        
        for(int i = 0 ; i < leng ; i ++){
             String uId = users.get(i).getId();
             if(id.equals(uId)){
                return true;
            } 
        }
        return false;
    }
    
    public boolean containName(String name){
        int leng = users.size();
        
        for(int i = 0 ; i < leng ; i ++){
             String uName = users.get(i).getName();
             if(name.equals(uName)){
                return true;
            } 
        }
        return false;
    }
     
    public String getNameById(String id){
        int leng = users.size();
        
        for(int i = 0 ; i < leng ; i ++){
             String uId = users.get(i).getId();
             if(id.equals(uId)){
                return users.get(i).getName();
            } 
        }
          
        return null;
    }
    
    public String getIdByName(String name){
        int leng = users.size();
        
        for(int i = 0 ; i < leng ; i ++){
             String uName = users.get(i).getName();
             if(name.equals(uName)){
                return users.get(i).getId();
            } 
        }
        return null;
    }
    
    public User getUser(String id){
        int leng = users.size();
        
        for(int i = 0 ; i < leng ; i ++){
             
             User user = users.get(i);
             String uId = user.getId();
             if(id.equals(uId)){
                return user;
            } 
        }
        return null;
    }
    
    
}
