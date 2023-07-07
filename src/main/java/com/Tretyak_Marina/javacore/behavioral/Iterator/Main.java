package main.java.com.Tretyak_Marina.javacore.behavioral.Iterator;

public class Main {
    public static void main(String[] args) {
        String[] ingredients = {"Cucumber", "Tomato", "Cheese", "Oil"};
        Salad salad = new Salad("Simple salad", ingredients);
        Iterator iterator = salad.getIterator();
        System.out.println("Salad: " + salad.getName());
        System.out.print("Ingredients: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString() + ", ");
        }
        System.out.println();
    }
}
