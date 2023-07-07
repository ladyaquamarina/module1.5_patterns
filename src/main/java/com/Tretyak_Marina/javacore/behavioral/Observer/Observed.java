package main.java.com.Tretyak_Marina.javacore.behavioral.Observer;

public interface Observed {
     public void addObserver(Observer observer);
     public void removeObserver(Observer observer);
     public void notifyObservers();
}
