package main.java.com.Tretyak_Marina.javacore.structural.Composite;

public class Main {
    public static void main(String[] args) {
        MusicGroup musicGroup = new MusicGroup();

        Musician singer = new Singer();
        Musician bassist = new Bassist();
        Musician drummer = new Drummer();

        musicGroup.addMusician(singer);
        musicGroup.addMusician(bassist);
        musicGroup.addMusician(drummer);

        musicGroup.writeMusic();
    }
}
