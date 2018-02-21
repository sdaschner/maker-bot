package com.sebastian_daschner.maker_bot;

import javax.ejb.Stateless;
import java.util.concurrent.locks.LockSupport;

@Stateless
public class MakerBot {

    public void print(String instrument) {
        LockSupport.parkNanos(80_000_000L);
        System.out.println("printing a " + instrument);
    }

}
