package main.java.com.Tretyak_Marina.javacore.structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class MusicGroup {
    private List<Musician> musicians = new ArrayList<>();
    public void addMusician(Musician musician) {
        musicians.add(musician);
    }
    public void removeMusician(Musician musician) {
        musicians.remove(musician);
    }
    public void writeMusic() {
        System.out.println("Music group writes music");
        for (Musician musician : musicians) {
            musician.createMusic();
        }
    }
}
