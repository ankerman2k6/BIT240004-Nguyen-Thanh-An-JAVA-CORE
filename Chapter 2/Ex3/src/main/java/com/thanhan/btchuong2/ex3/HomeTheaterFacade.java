/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanhan.btchuong2.ex3;

/**
 *
 * @author nguyenthanhan
 */
public class HomeTheaterFacade {
    private Device tv;
    private Device dvd;
    private Device sound;

    public HomeTheaterFacade(Device tv, Device dvd, Device sound) {
        this.tv = tv;
        this.dvd = dvd;
        this.sound = sound;
    }
    
    
    public void WatchMovie(){
        System.out.println("Chuẩn bị chiếu phim......");
        tv.on();
        dvd.on();
        sound.on();
    }
}
