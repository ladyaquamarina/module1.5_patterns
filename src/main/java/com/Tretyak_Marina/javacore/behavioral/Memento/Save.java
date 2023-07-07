package main.java.com.Tretyak_Marina.javacore.behavioral.Memento;

import java.util.Date;

public class Save {
    private String level;
    private Date date;

    public Save(String level) {
        this.level = level;
        this.date = new Date();
    }

    public String getLevel() {
        return level;
    }

    public Date getDate() {
        return date;
    }
}
