package com.newcomb.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private String url = "jdbc:postgresql://localhost/javafxpsql";
    private String username = "postgres";
    private String password = "196711aa";

    public Connection conn;

    public Connection getConn(){
        try{
            conn = DriverManager.getConnection(url,username,password);
            System.out.println("Connected");
        }catch(SQLException ex){
            System.out.println("Not connected");
            ex.printStackTrace();
        }
        return conn;
    }
}
