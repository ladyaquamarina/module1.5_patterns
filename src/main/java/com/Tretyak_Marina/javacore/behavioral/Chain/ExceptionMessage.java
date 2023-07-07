package main.java.com.Tretyak_Marina.javacore.behavioral.Chain;

public class ExceptionMessage extends Message{
    public ExceptionMessage(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Exception: " + message);
    }
}
