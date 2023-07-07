package main.java.com.Tretyak_Marina.javacore.behavioral.Iterator;

public class Salad implements Collection{
    private String name;
    private String[] ingredients;

    public Salad(String name, String[] vegetables) {
        this.name = name;
        this.ingredients = vegetables;
    }

    public String getName() {
        return name;
    }

    public String[] getVegetables() {
        return ingredients;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVegetables(String[] vegetables) {
        this.ingredients = vegetables;
    }

    @Override
    public Iterator getIterator() {
        return new IngredientsIterator();
    }
    private class IngredientsIterator implements Iterator {
        int index;
        public boolean hasNext() {
            return index < ingredients.length;
        }
        public Object next() {
            return ingredients[index++];
        }
    }
}
