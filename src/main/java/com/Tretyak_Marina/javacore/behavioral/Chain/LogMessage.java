package main.java.com.Tretyak_Marina.javacore.behavioral.Chain;

public class LogMessage extends Message{
    public LogMessage(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Simple message: " + message);
    }
}
