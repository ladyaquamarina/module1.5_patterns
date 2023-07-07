package main.java.com.Tretyak_Marina.javacore.creational.Builder;

public class Director {
    HouseBuilder builder;

    public void setBuilder(HouseBuilder builder) {
        this.builder = builder;
    }
    House buildHouse() {
        builder.createHouse();
        builder.buildName();
        builder.buildMaxFloors();
        builder.buildMinSquare();
        builder.buildMaxSquare();

        House house = builder.getHouse();
        return house;
    }
}
