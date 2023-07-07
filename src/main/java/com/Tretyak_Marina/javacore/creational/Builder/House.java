package main.java.com.Tretyak_Marina.javacore.creational.Builder;

public class House {
    private String name;
    private int maxFloors;
    private int minSquare;
    private int maxSquare;

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxFloors(int maxFloors) {
        this.maxFloors = maxFloors;
    }

    public void setMaxSquare(int maxSquare) {
        this.maxSquare = maxSquare;
    }

    public void setMinSquare(int minSquare) {
        this.minSquare = minSquare;
    }

    @Override
    public String toString() {
        return "House{" +
                "name='" + name + '\'' +
                ", maxFloors=" + maxFloors +
                ", minSquare=" + minSquare +
                ", maxSquare=" + maxSquare +
                '}';
    }
}
