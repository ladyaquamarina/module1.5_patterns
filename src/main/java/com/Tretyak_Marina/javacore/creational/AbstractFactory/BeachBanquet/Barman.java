package main.java.com.Tretyak_Marina.javacore.creational.AbstractFactory.BeachBanquet;

import main.java.com.Tretyak_Marina.javacore.creational.AbstractFactory.Chef;

public class Barman implements Chef {
    @Override
    public void cook() {
        System.out.println("Barman prepares cocktails");
    }
}
