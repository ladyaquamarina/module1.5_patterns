package main.java.com.Tretyak_Marina.javacore.behavioral.Visitor;

public class CookingFood implements CookingSupplies{
    private final CookingSupplies[] cookingSupplies;

    public CookingFood() {
        this.cookingSupplies = new CookingSupplies[] {
                new Knife(),
                new KitchenStove(),
                new Plate(),
        };
    }
    @Override
    public void beUsing(Cooker cooker) {
        for(CookingSupplies cs : cookingSupplies) {
            cs.beUsing(cooker);
        }
    }
}
