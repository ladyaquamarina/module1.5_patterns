package main.java.com.Tretyak_Marina.javacore.behavioral.Visitor;

public class Knife implements CookingSupplies{
    @Override
    public void beUsing(Cooker cooker) {
        cooker.use(this);
    }
}
