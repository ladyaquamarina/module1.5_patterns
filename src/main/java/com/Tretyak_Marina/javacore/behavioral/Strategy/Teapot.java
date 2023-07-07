package main.java.com.Tretyak_Marina.javacore.behavioral.Strategy;

public class Teapot {
    private Activity activity;
    public void setActivity(Activity activity) {
        this.activity = activity;
    }
    public void justDoIt() {
        activity.justDoIt();
    }
}
