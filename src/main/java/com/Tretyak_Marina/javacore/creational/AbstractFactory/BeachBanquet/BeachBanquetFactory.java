package main.java.com.Tretyak_Marina.javacore.creational.AbstractFactory.BeachBanquet;

import main.java.com.Tretyak_Marina.javacore.creational.AbstractFactory.Administrator;
import main.java.com.Tretyak_Marina.javacore.creational.AbstractFactory.CateringTeamFactory;
import main.java.com.Tretyak_Marina.javacore.creational.AbstractFactory.Chef;
import main.java.com.Tretyak_Marina.javacore.creational.AbstractFactory.Waiter;

public class BeachBanquetFactory implements CateringTeamFactory {
    @Override
    public Chef getChef() {
        return new Barman();
    }

    @Override
    public Waiter getWaiter() {
        return new BCWaiter();
    }

    @Override
    public Administrator getAdministrator() {
        return new BCAdmin();
    }
}
