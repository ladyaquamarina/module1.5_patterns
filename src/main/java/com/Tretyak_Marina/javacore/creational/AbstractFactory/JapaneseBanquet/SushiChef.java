package main.java.com.Tretyak_Marina.javacore.creational.AbstractFactory.JapaneseBanquet;

import main.java.com.Tretyak_Marina.javacore.creational.AbstractFactory.Chef;

public class SushiChef implements Chef {
    @Override
    public void cook() {
        System.out.println("Sushi chef prepares sushi");
    }
}
