package com.proto.app;

import java.io.PrintWriter;

public class UserService {


    public String addUSer(User usr){

        //write user to file
        System.out.println(usr.getName());
        String path = usr.getName()+".txt";

        try {

            PrintWriter writer = new PrintWriter(path, "UTF-8");
            writer.print(usr.getName());
            writer.close();
        }
        catch (Exception e){
            System.out.println(e.toString());

        }

        return "user "+ usr.getName()+" added!";

    }




    //close file
}
