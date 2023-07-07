package main.java.com.Tretyak_Marina.javacore.structural.Facade;

public class Worker {
    public void doJobWhileWorkTime(Pipeline pipeline) {
        if (pipeline.isActive()) {
            System.out.println("Worker is working");
        } else {
            System.out.println("Worker is resting");
        }
    }
}
