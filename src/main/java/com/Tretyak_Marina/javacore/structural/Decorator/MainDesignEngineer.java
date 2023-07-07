package main.java.com.Tretyak_Marina.javacore.structural.Decorator;

public class MainDesignEngineer extends EngineerDecorator{
    MainDesignEngineer(Engineer engineer) {
        super(engineer);
    }
    public String makeChecks() {
        return "Checks drafts. ";
    }
    @Override
    public String working() {
        return super.working() + makeChecks();
    }
}
