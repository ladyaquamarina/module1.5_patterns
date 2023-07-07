package main.java.com.Tretyak_Marina.javacore.behavioral.Chain;

public class WarningMessage extends Message{
    public WarningMessage(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Warning: " + message);
    }
}
