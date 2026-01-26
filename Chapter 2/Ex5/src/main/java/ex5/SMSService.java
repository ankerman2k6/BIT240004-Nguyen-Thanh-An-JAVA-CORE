/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5;

/**
 *
 * @author nguyenthanhan
 */
public class SMSService implements MessageService{

    @Override
    public void sendMessage(String message) {
        System.out.println("Đang gửi bằng SMS... "+ message);
    }
    
}
