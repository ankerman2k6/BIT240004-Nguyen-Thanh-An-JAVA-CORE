/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.thanhan.btchuong2;

import com.thanhan.btchuong2.ex3.DVDPlayer;
import com.thanhan.btchuong2.ex3.Device;
import com.thanhan.btchuong2.ex3.HomeTheaterFacade;
import com.thanhan.btchuong2.ex3.SoundSystem;
import com.thanhan.btchuong2.ex3.TV;

/**
 *
 * @author nguyenthanhan
 */
public class Btchuong2 {
    public static void main(String[] args) {
        Device tv = new TV();
        Device dvd = new DVDPlayer();
        Device sound = new SoundSystem();
        
        HomeTheaterFacade theater = new HomeTheaterFacade(tv, dvd, sound);
        
        theater.WatchMovie();
    }

}
