package com.proto.app;

import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UserService {


    public String addUSer(User usr){

        LocalDateTime localDatetime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss");
        String formatedDateTime = localDatetime.format(formatter);

        //write user to file
        System.out.println(usr.getName()+" -->"+formatedDateTime);
        String path = "filesdata/"+usr.getName()+"-"+formatedDateTime+".txt";

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
