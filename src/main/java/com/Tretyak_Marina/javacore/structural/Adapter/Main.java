package main.java.com.Tretyak_Marina.javacore.structural.Adapter;

public class Main {
    public static void main(String[] args) {
        Meaning talking = new AdapterRussianToMeaning();

        talking.hello();
        talking.asking();
        talking.thanks();
        talking.goodbye();
    }
}
