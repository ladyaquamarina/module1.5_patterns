package main.java.com.Tretyak_Marina.javacore.creational.AbstractFactory.ItalianBanquet;

import main.java.com.Tretyak_Marina.javacore.creational.AbstractFactory.Administrator;
import main.java.com.Tretyak_Marina.javacore.creational.AbstractFactory.CateringTeamFactory;
import main.java.com.Tretyak_Marina.javacore.creational.AbstractFactory.Chef;
import main.java.com.Tretyak_Marina.javacore.creational.AbstractFactory.Waiter;

public class ItalianBanquetFactory implements CateringTeamFactory {
    @Override
    public Chef getChef() {
        return new ICChef();
    }

    @Override
    public Waiter getWaiter() {
        return new Garson();
    }

    @Override
    public Administrator getAdministrator() {
        return new ICAdmin();
    }
}
