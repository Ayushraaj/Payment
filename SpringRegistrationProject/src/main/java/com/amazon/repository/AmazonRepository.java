package com.amazon.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.amazon.pojo.Pojo;

@Repository
public class AmazonRepository {

    ArrayList<Pojo> users = new ArrayList<>();

    public void saveUser(Pojo user) {

        users.add(user);
        
        

        System.out.println("User Saved Successfully");
        System.out.println("Total Users : " + users.size());
    }

    public boolean emailExists(String email) {

        for(Pojo user : users) {
        	System.out.println("All the registered emails are: "+ user.getEmail());

            if(user.getEmail().equals(email)) {
                return true;
            }
        }
        System.out.println("This email does not exist");
        return false;
    }

    public boolean loginCheck(String email,
                              String password) {

        for(Pojo user : users) {

            if(user.getEmail().equals(email)
                    &&
               user.getPassword().equals(password)) {

                return true;
            }
        }
        System.out.println("Email or password is invalid");
        return false;
    }

    public boolean updatePassword(String email,
                                  String newPassword) {

        for(Pojo user : users) {
        	
        	System.out.println("All the registed emails are : "+ user.getEmail());

            if(user.getEmail().equals(email)) {

                user.setPassword(newPassword);
                user.setConformPassword(newPassword);

                return true;
            }
        }

        return false;
    }

    public Pojo getUserByEmail(String email) {

        for(Pojo user : users) {

            if(user.getEmail().equals(email)) {
                return user;
            }
        }

        return null;
    }
    
    
}