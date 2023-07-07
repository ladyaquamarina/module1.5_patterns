package main.java.com.Tretyak_Marina.javacore.structural.Decorator;

public class EngineerDecorator implements Engineer{
    private Engineer engineer;
    EngineerDecorator(Engineer engineer) {
        this.engineer = engineer;
    }
    @Override
    public String working() {
        return engineer.working();
    }
}
