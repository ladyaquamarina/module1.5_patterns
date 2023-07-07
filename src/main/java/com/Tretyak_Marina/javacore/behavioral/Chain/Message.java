package main.java.com.Tretyak_Marina.javacore.behavioral.Chain;

public abstract class Message {
    private int priority;
    private Message nextLevelMessage;
    public Message(int priority) {
        this.priority = priority;
    }
    public void setNextLevelMessage(Message nextLevelMessage) {
        this.nextLevelMessage = nextLevelMessage;
    }
    public void throwMessage(String message, int level) {
        if (level > priority) {
            nextLevelMessage.throwMessage(message, level);
        } else if (level == priority) {
            write(message);
        }
    }
    public abstract void write(String message);
}
