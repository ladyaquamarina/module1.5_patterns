package main.java.com.Tretyak_Marina.javacore.behavioral.State;

public class Main {
    public static void main(String[] args) {
        Activity activity = new WarmUp();
        Teapot teapot = new Teapot();

        teapot.setActivity(activity);

        for(int i = 0; i < 10; i++) {
            teapot.justDoIt();
            teapot.changeState();
        }
    }
}
