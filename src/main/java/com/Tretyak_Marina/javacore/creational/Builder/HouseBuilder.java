package main.java.com.Tretyak_Marina.javacore.creational.Builder;

public abstract class HouseBuilder {
    House house;
    void createHouse() {
        house = new House();
    }
    abstract void buildName();
    abstract void buildMaxFloors();
    abstract void buildMinSquare();
    abstract void buildMaxSquare();
    House getHouse() {
        return house;
    }
}
