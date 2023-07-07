package main.java.com.Tretyak_Marina.javacore.behavioral.Observer;

public class Main {
    public static void main(String[] args) {
        MainDatabaseTable mainDatabaseTable = new MainDatabaseTable();

        mainDatabaseTable.addRecord("record 1");
        mainDatabaseTable.addRecord("record 2");
        Observer supTable1 = new SupDatabaseTable("SupTable1");
        Observer supTable2 = new SupDatabaseTable("SupTable2");
        mainDatabaseTable.addObserver(supTable1);
        mainDatabaseTable.addObserver(supTable2);
        mainDatabaseTable.addRecord("record 3");
        mainDatabaseTable.removeRecord("record 2");
    }
}
