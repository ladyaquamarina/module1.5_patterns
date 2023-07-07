package main.java.com.Tretyak_Marina.javacore.creational.Prototype;

public class SircleFactory {
    Sircle sircle;
    public SircleFactory(Sircle sircle) {
        this.sircle = sircle;
    }
    public void setSircle(Sircle sircle) {
        this.sircle = sircle;
    }
    Sircle cloneSircle() {
        return (Sircle) sircle.copy();
    }
}
