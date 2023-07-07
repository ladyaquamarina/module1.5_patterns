package main.java.com.Tretyak_Marina.javacore.behavioral.Visitor;

public class Housewife implements Cooker{
    @Override
    public void use(Knife knife) {
        System.out.println("Slow cutting food");
    }

    @Override
    public void use(KitchenStove kitchenStove) {
        System.out.println("Using one hob at once");
    }

    @Override
    public void use(Plate plate) {
        System.out.println("Just putting food on plate");
    }
}
