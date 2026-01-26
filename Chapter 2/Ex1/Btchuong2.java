/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.thanhan.btchuong2;

/**
 *
 * @author nguyenthanhan
 */
public class Btchuong2 {

    public static void main(String[] args) {
        DatabaseConnection config = DatabaseConnection.getInstance();
        config.setConnectionString("USER: THANH AN PASSWORD 7890");
        
        config.printInfo();
        
        
        DatabaseConnection config2 = DatabaseConnection.getInstance();
        System.out.println("Có cùng instance "+ (config == config2));
    }
}
