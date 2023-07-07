package main.java.com.Tretyak_Marina.javacore.behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class MainDatabaseTable implements Observed{
    List<String> records = new ArrayList<>();
    List<Observer> subTables = new ArrayList<>();
    public void addRecord(String record) {
        this.records.add(record);
        notifyObservers();
    }
    public void removeRecord(String record) {
        this.records.remove(record);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subTables.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subTables.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o: subTables) {
            o.handleEvent(records);
        }
    }
}
