package main.java.com.Tretyak_Marina.javacore.structural.Bridge;

public abstract class Building {
    protected Engineer engineer;
    protected Building(Engineer engineer) {
        this.engineer = engineer;
    }
    protected abstract void build();
}
