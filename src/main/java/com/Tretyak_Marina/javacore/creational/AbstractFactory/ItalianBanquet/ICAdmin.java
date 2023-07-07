package main.java.com.Tretyak_Marina.javacore.creational.AbstractFactory.ItalianBanquet;

import main.java.com.Tretyak_Marina.javacore.creational.AbstractFactory.Administrator;

public class ICAdmin implements Administrator {
    @Override
    public void manageHall() {
        System.out.println("Administrator manages the Italian cuisine banquet");
    }
}
