package main.java.com.Tretyak_Marina.javacore.creational.Builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new IndividualHouseBuilder());
        House house = director.buildHouse();
        System.out.println(house);
        System.out.println();

        director.setBuilder(new ApartmentHouseBuilder());
        house = director.buildHouse();
        System.out.println(house);
    }
}
