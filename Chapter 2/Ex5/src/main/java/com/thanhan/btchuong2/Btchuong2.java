/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.thanhan.btchuong2;



import ex5.EmailService;
import ex5.Notification;
import ex5.SMSService;

/**
 *
 * @author nguyenthanhan
 */
public class Btchuong2 {
    public static void main(String[] args) {
        Notification ntf = new Notification();  
        ntf.setMessageService(new EmailService());
        ntf.notifyUsers("SIUUUUU");
        
        Notification ntf2 = new Notification();
        ntf2.setMessageService(new SMSService());
        ntf2.notifyUsers("Manchester UTD");
        
        
        
        
    }

}
