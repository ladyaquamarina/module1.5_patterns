package main.java.com.Tretyak_Marina.javacore.structural.Facade;

public class Pipeline {
    private boolean active;
    public boolean isActive() {
        return active;
    }
    public void startMoving() {
        System.out.println("Pipeline started moving");
        active = true;
    }
    public void stopMoving() {
        System.out.println("Pipeline stopped moving");
        active = false;
    }
}
