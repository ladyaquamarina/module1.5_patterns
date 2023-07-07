package main.java.com.Tretyak_Marina.javacore.creational.Builder;

public class IndividualHouseBuilder extends HouseBuilder {
    @Override
    void buildName() {
        house.setName("Individual house");
    }

    @Override
    void buildMaxFloors() {
        house.setMaxFloors(4);
    }

    @Override
    void buildMinSquare() {
        house.setMinSquare(15);
    }

    @Override
    void buildMaxSquare() {
        house.setMaxSquare(400);
    }
}
