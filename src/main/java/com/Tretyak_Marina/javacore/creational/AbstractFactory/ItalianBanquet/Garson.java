package main.java.com.Tretyak_Marina.javacore.creational.AbstractFactory.ItalianBanquet;

import main.java.com.Tretyak_Marina.javacore.creational.AbstractFactory.Waiter;

public class Garson implements Waiter {
    @Override
    public void serverGuests() {
        System.out.println("Garson servers guests of the banquet");
    }
}
