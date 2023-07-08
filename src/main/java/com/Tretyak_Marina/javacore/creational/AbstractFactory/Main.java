package main.java.com.Tretyak_Marina.javacore.creational.AbstractFactory;

import main.java.com.Tretyak_Marina.javacore.creational.AbstractFactory.BeachBanquet.BeachBanquetFactory;
import main.java.com.Tretyak_Marina.javacore.creational.AbstractFactory.ItalianBanquet.ItalianBanquetFactory;
import main.java.com.Tretyak_Marina.javacore.creational.AbstractFactory.JapaneseBanquet.JapaneseBanquetFactory;

public class Main {
    public static void main(String[] args) {
        JapaneseParty();
        System.out.println();
        BeachParty();
    }
    public static void JapaneseParty() {
        CateringTeamFactory cateringTeamFactory = new JapaneseBanquetFactory();
        Chef chef = cateringTeamFactory.getChef();
        Waiter waiter = cateringTeamFactory.getWaiter();
        Administrator administrator = cateringTeamFactory.getAdministrator();

        System.out.println("Starting Japanese-style banquet");
        chef.cook();
        waiter.serverGuests();
        administrator.manageHall();
    }
    public static void BeachParty() {
        CateringTeamFactory cateringTeamFactory = new BeachBanquetFactory();
        Chef chef = cateringTeamFactory.getChef();
        Waiter waiter = cateringTeamFactory.getWaiter();
        Administrator administrator = cateringTeamFactory.getAdministrator();

        System.out.println("Starting beach party");
        chef.cook();
        waiter.serverGuests();
        administrator.manageHall();
    }
    public static void ItalianParty() {
        CateringTeamFactory cateringTeamFactory = new ItalianBanquetFactory();
        Chef chef = cateringTeamFactory.getChef();
        Waiter waiter = cateringTeamFactory.getWaiter();
        Administrator administrator = cateringTeamFactory.getAdministrator();

        System.out.println("Starting Italian-style banquet");
        chef.cook();
        waiter.serverGuests();
        administrator.manageHall();
    }
}
