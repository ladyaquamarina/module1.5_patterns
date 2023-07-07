package main.java.com.Tretyak_Marina.javacore.creational.AbstractFactory.BeachBanquet;

import main.java.com.Tretyak_Marina.javacore.creational.AbstractFactory.Administrator;

public class BCAdmin implements Administrator {
    @Override
    public void manageHall() {
        System.out.println("Administrator manages the beach party");
    }
}
