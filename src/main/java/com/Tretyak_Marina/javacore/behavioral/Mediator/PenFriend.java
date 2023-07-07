package main.java.com.Tretyak_Marina.javacore.behavioral.Mediator;

public interface PenFriend {
    public void sendLetter(String text, PenFriend addressee);
    public void getLetter(String text);
}
