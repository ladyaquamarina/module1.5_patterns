package main.java.com.Tretyak_Marina.javacore.behavioral.Template;

public class Main {
    public static void main(String[] args) {
        Salad mayonnaiseSalad = new MayonnaiseSalad();
        Salad oilSalad = new OilSalad();
        Salad sourCreamSalad = new SourCreamSalad();

        oilSalad.showIngredients();
        mayonnaiseSalad.showIngredients();
        sourCreamSalad.showIngredients();
    }
}
