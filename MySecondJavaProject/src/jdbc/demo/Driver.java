package jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Driver {
    public static void main(String[] args) {
        // write your code here
        try{
            //1. Get a connection;
            Connection myConnection= DriverManager.getConnection("jdbc:mysql://localhost:3308/bazadedatenoua","root","");

            //2.Create a statement;
            Statement myStatement=myConnection.createStatement();

            //3.Execute SQL query;
            ResultSet myResults=myStatement.executeQuery("select * from persons");

            //4.Process the result set;
            while(myResults.next()){
                System.out.println(myResults.getString("PersonID")+"; "
                        +myResults.getString("LastName")+"; "+myResults.getString("FirstName"));
            }



        }
        catch(Exception e){
            e.printStackTrace();


        }





    }
}
