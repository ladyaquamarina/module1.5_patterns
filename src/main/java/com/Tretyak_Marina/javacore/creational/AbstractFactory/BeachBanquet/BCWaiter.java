package main.java.com.Tretyak_Marina.javacore.creational.AbstractFactory.BeachBanquet;

import main.java.com.Tretyak_Marina.javacore.creational.AbstractFactory.Waiter;

public class BCWaiter implements Waiter {
    @Override
    public void serverGuests() {
        System.out.println("Waiter servers guests of beach party");
    }
}
