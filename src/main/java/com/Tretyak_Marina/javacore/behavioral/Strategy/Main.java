package main.java.com.Tretyak_Marina.javacore.behavioral.Strategy;

import main.java.com.Tretyak_Marina.javacore.behavioral.State.Boil;
import main.java.com.Tretyak_Marina.javacore.behavioral.State.CoolDown;
import main.java.com.Tretyak_Marina.javacore.behavioral.State.Teapot;
import main.java.com.Tretyak_Marina.javacore.behavioral.State.Wait;
import main.java.com.Tretyak_Marina.javacore.behavioral.State.WarmUp;

public class Main {
    public static void main(String[] args) {
        Teapot teapot = new Teapot();

        teapot.setActivity(new Wait());
        teapot.justDoIt();

        teapot.setActivity(new WarmUp());
        teapot.justDoIt();

        teapot.setActivity(new Boil());
        teapot.justDoIt();

        teapot.setActivity(new CoolDown());
        teapot.justDoIt();

        teapot.setActivity(new Wait());
        teapot.justDoIt();
    }
}
