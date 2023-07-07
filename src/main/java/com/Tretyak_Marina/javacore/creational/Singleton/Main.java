package main.java.com.Tretyak_Marina.javacore.creational.Singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println(SingleClass.getSingleClass());
        System.out.println(SingleClass.getSingleClass());
        System.out.println(SingleClass.getSingleClass());

        SingleClass.getSingleClass().addToLogFile("1");
        SingleClass.getSingleClass().addToLogFile("2");
        SingleClass.getSingleClass().addToLogFile("3");
        SingleClass.getSingleClass().showLogFile();
    }
}
