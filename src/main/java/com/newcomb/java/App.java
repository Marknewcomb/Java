package com.newcomb.java;

public class App {
    public static void main(String[] args){
        System.out.println("Main menu");
        Database db = new Database();
        db.getConn();
    }
}
