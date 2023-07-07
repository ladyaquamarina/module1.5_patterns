package main.java.com.Tretyak_Marina.javacore.behavioral.Memento;

import java.util.Date;

public class Game {
    private String level;
    private Date date;
    public void setGameSaving(String  level) {
        this.level = level;
        this.date = new Date();
    }
    public Save save() {
        return new Save(level);
    }
    public void load(Save save) {
        level = save.getLevel();
        date = save.getDate();
    }

    @Override
    public String toString() {
        return "Game:\n" +
                "level=" + level +
                "\ndate=" + date +
                '\n';
    }
}
