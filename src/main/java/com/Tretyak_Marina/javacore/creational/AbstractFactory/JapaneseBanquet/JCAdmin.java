package main.java.com.Tretyak_Marina.javacore.creational.AbstractFactory.JapaneseBanquet;

import main.java.com.Tretyak_Marina.javacore.creational.AbstractFactory.Administrator;

public class JCAdmin implements Administrator {
    @Override
    public void manageHall() {
        System.out.println("Administrator manages the Japanese cuisine banquet");
    }
}
