package main.java.com.Tretyak_Marina.javacore.structural.Adapter;

public class AdapterRussianToMeaning extends RussianLanguage implements Meaning {
    @Override
    public void hello() {
        sayHello();
    }

    @Override
    public void goodbye() {
        sayGoodbye();
    }

    @Override
    public void asking() {
        askSomething();
    }

    @Override
    public void thanks() {
        sayThanks();
    }
}
