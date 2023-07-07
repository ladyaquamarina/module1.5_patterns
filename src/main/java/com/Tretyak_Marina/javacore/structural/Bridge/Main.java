package main.java.com.Tretyak_Marina.javacore.structural.Bridge;

public class Main {
    public static void main(String[] args) {
        Building[] buildings = {
                new ShoppingCenter(new ArchitectEngineer()),
                new IndividualHouse(new ElectricalEngineer())
        };
        for (Building building : buildings) {
            building.build();
        }
    }
}
