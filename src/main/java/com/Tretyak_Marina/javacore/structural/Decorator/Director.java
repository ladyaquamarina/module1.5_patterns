package main.java.com.Tretyak_Marina.javacore.structural.Decorator;

public class Director extends EngineerDecorator{
    Director(Engineer engineer) {
        super(engineer);
    }
    public String holdMeetings() {
        return "Holds meetings. ";
    }
    @Override
    public String working() {
        return super.working() + holdMeetings();
    }
}
