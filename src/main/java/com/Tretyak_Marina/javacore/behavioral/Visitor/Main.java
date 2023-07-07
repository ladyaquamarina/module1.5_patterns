package main.java.com.Tretyak_Marina.javacore.behavioral.Visitor;

public class Main {
    public static void main(String[] args) {
        CookingFood cookingFood = new CookingFood();

        Cooker housewife = new Housewife();
        Cooker chef = new Chef();

        System.out.println("Housewife is cooking...");
        cookingFood.beUsing(housewife);
        System.out.println("\n===============================\n");
        System.out.println("Chef is cooking...");
        cookingFood.beUsing(chef);
    }
}
