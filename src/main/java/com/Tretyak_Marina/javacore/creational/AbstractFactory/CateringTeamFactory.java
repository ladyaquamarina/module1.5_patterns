package main.java.com.Tretyak_Marina.javacore.creational.AbstractFactory;

public interface CateringTeamFactory {
    Chef getChef();
    Waiter getWaiter();
    Administrator getAdministrator();
}
