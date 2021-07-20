package jdbc.demo;
//Java Data Base Connectivity:
//1)

import com.sun.deploy.net.proxy.SunAutoProxyHandler;

import java.sql.*;

/*
*   1) Import=> java.sql
*   2) Load and register the driver=> oracle.driver
*                                  => com.mysql.jdbc.Driver
*   3) Create connection=> Connection
*   4) Create a statement=>Statement
*   5) Execute the query
*   6) Process the result
*   7) Close
*
 */
public class Driver2 {
    public static void main(String[] args) throws Exception {
        String url="jdbc:mysql://localhost:3308/bazadedatenoua";
        String userName="root";
        String password="";
        String personId="879";
        String firstName="Nicolae";
        String lastName="Oprescu";
        String address="Calea Bucuresti nr.10";
        String city="Timisoara";

        //Query used to read something from a Mysql table
        String query="select * from persons";
        //Query used to write something in a Mysql table
        String query1="insert into persons values (356,'Vladoiu','Andrei','Str. Noua nr.18','Brasov')";
        //2)
        //Class.forName("com.mysql.cj.jdbc.Driver");
        //3)
        Connection con =DriverManager.getConnection(url,userName,password);//Connection is an interface
        //4)
        Statement st =con.createStatement();
        //5)
        //Pentru a scrie data in tabelul SQL
        int count=st.executeUpdate(query1);
        System.out.println("Count "+count+" rows affected!");
        //Pentru a citi date din tabelul SQL
        ResultSet rs =st.executeQuery(query);// DDL(Data Definition Language);
                                              // DML(Data Manipulation Language)-> insert data in a DB;
                                              // DQL(Data Query Language)-> fetch a aduce date din DB;
                                              // DCL (Data Control Language).
                                              // TCL (Transaction Control Language).




        while(rs.next()) {
            String name = rs.getString("FirstName");
            String name1=rs.getInt("PersonID")+rs.getString("LastName");
            System.out.println(name);
            System.out.println("The selected person is :"+name1);
        }

        st.close();
        rs.close();
    }
}

