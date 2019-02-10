package com.proto.app;

public class UserService {

    //create file for write

    public String addUSer(User usr){

        //write user to file
        System.out.println(usr.getName());
        return "user "+ usr.getName()+" added!";

    }




    //close file
}
