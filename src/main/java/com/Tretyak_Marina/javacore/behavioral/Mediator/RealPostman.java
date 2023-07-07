package main.java.com.Tretyak_Marina.javacore.behavioral.Mediator;

import java.util.ArrayList;
import java.util.List;

public class RealPostman implements Postman{
    List<PenFriend> clients = new ArrayList<>();
    public void addClient(PenFriend client) {
        this.clients.add(client);
    }
    @Override
    public void sendLetter(String text, PenFriend addressee) {
        for (PenFriend client : clients) {
            if (client == addressee) {
                client.getLetter(text);
            }
        }
    }
}
