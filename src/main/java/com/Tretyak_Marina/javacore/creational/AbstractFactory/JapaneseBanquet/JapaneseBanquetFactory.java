package main.java.com.Tretyak_Marina.javacore.creational.AbstractFactory.JapaneseBanquet;

import main.java.com.Tretyak_Marina.javacore.creational.AbstractFactory.Administrator;
import main.java.com.Tretyak_Marina.javacore.creational.AbstractFactory.CateringTeamFactory;
import main.java.com.Tretyak_Marina.javacore.creational.AbstractFactory.Chef;
import main.java.com.Tretyak_Marina.javacore.creational.AbstractFactory.Waiter;

public class JapaneseBanquetFactory implements CateringTeamFactory {
    @Override
    public Chef getChef() {
        return new SushiChef();
    }

    @Override
    public Waiter getWaiter() {
        return new Simisen();
    }

    @Override
    public Administrator getAdministrator() {
        return new JCAdmin();
    }
}
