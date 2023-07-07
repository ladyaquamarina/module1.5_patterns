package main.java.com.Tretyak_Marina.javacore.creational.Builder;

public class ApartmentHouse extends HouseBuilder{
    @Override
    void buildName() {
        house.setName("Apartment house");
    }

    @Override
    void buildMaxFloors() {
        house.setMaxFloors(80);
    }

    @Override
    void buildMinSquare() {
        house.setMinSquare(1000);
    }

    @Override
    void buildMaxSquare() {
        house.setMaxSquare(10000);
    }
}
