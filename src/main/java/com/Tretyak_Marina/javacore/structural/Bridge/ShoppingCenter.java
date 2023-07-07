package main.java.com.Tretyak_Marina.javacore.structural.Bridge;

public class ShoppingCenter extends Building {
    ShoppingCenter(Engineer engineer) {
        super(engineer);
    }
    @Override
    protected void build() {
        System.out.println("Shopping center is being built...");
        engineer.working();
    }
}
