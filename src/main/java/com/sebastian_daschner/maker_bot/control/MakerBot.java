package com.sebastian_daschner.maker_bot.control;

import javax.ejb.Stateless;

@Stateless
public class MakerBot {

    public void print(String instrument) {
        System.out.println("printing a " + instrument);
    }

}
