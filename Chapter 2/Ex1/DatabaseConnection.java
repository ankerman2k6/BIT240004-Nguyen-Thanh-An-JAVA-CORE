/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanhan.btchuong2;

/**
 *
 * @author nguyenthanhan
 */
public class DatabaseConnection {
    private static DatabaseConnection instance;
    
    private String connectionString = "USER: THANHAN PASSWORD: 12345";

    private DatabaseConnection() {
        System.out.println("Đã config");
    }
    
    
    public static DatabaseConnection getInstance(){
        if(instance == null){
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }
    
    public void printInfo(){
        DatabaseConnection config = DatabaseConnection.getInstance();
        System.out.println("Connection String: " + config.getConnectionString());
    }
    
    
    
}
