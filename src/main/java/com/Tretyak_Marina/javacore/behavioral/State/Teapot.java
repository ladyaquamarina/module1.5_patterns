package main.java.com.Tretyak_Marina.javacore.behavioral.State;

public class Teapot {
    private Activity activity;
    public void setActivity(Activity activity) {
        this.activity = activity;
    }
    public void changeState() {
        if (activity instanceof WarmUp) {
            setActivity(new Boil());
        } else if (activity instanceof  Boil) {
            setActivity(new CoolDown());
        } else if (activity instanceof CoolDown) {
            setActivity(new Wait());
        } else if (activity instanceof Wait) {
            setActivity(new WarmUp());
        }
    }
    public void justDoIt() {
        activity.justDoIt();
    }
}
