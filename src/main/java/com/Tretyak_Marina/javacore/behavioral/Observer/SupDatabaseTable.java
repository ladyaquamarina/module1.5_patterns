package main.java.com.Tretyak_Marina.javacore.behavioral.Observer;

import java.util.List;

public class SupDatabaseTable implements Observer{
    private String name;

    public SupDatabaseTable(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> records) {
        System.out.println("Table " + name + " got changes in main table:\n" + records + "\n");
    }
}
