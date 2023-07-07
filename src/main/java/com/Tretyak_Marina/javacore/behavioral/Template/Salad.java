package main.java.com.Tretyak_Marina.javacore.behavioral.Template;

public abstract class Salad {
    private String ingredients = "Cucumber, Tomato";
    public void showIngredients() {
        ingredients += saladDressing();
        System.out.println(ingredients);
    }
    public abstract String saladDressing();
}
