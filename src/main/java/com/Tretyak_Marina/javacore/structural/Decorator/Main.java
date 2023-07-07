package main.java.com.Tretyak_Marina.javacore.structural.Decorator;

public class Main {
    public static void main(String[] args) {
        Engineer engineer = new Director(new MainDesignEngineer(new DesignEngineer()));
        System.out.println(engineer.working());
    }
}
