/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5;

/**
 *
 * @author nguyenthanhan
 */
public class Notification {
    private  MessageService msg;
    
    public void setMessageService(MessageService msg){
        this.msg = msg;
    }
    
    public void notifyUsers(String message){
        if(msg == null){
            System.out.println("Chưa chọn phương thức");
        }
        msg.sendMessage(message);
    }
}
