package main.java.com.Tretyak_Marina.javacore.behavioral.Mediator;

public class RealPenFriend implements PenFriend{
    private String name;
    private Postman postman;

    public RealPenFriend(String name, Postman postman) {
        this.name = name;
        this.postman = postman;
    }

    @Override
    public void sendLetter(String text, PenFriend addressee) {
        postman.sendLetter(text, addressee);
    }

    @Override
    public void getLetter(String text) {
        System.out.println(this.name + " receiving letter: " + text);
    }
}
