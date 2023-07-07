package main.java.com.Tretyak_Marina.javacore.structural.Bridge;

public class IndividualHouse extends Building {
    IndividualHouse(Engineer engineer) {
        super(engineer);
    }
    @Override
    protected void build() {
        System.out.println("Individual house is being built...");
        engineer.working();
    }
}
