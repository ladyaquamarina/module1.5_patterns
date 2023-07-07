package main.java.com.Tretyak_Marina.javacore.behavioral.Mediator;

public class Main {
    public static void main(String[] args) {
        RealPostman postman = new RealPostman();
        PenFriend penFriend1 = new RealPenFriend("first", postman);
        PenFriend penFriend2 = new RealPenFriend("second", postman);
        PenFriend penFriend3 = new RealPenFriend("third", postman);

        postman.addClient(penFriend1);
        postman.addClient(penFriend2);
        postman.addClient(penFriend3);

        penFriend1.sendLetter("Hello, I am first", penFriend2);
        penFriend2.sendLetter("I am second", penFriend3);
    }
}