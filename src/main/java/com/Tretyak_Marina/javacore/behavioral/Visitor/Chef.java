package main.java.com.Tretyak_Marina.javacore.behavioral.Visitor;

public class Chef implements Cooker{
    @Override
    public void use(Knife knife) {
        System.out.println("Fast cutting food");
    }

    @Override
    public void use(KitchenStove kitchenStove) {
        System.out.println("Using several hobs at once");
    }

    @Override
    public void use(Plate plate) {
        System.out.println("Preparing the restaurant serving of food");
    }
}
