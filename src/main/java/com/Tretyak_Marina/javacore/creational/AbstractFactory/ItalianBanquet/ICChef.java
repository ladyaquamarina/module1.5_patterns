package main.java.com.Tretyak_Marina.javacore.creational.AbstractFactory.ItalianBanquet;

import main.java.com.Tretyak_Marina.javacore.creational.AbstractFactory.Chef;

public class ICChef implements Chef {
    @Override
    public void cook() {
        System.out.println("Chef cooks the Italian food");
    }
}
