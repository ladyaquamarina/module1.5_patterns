package main.java.com.Tretyak_Marina.javacore.structural.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EngineerFactory engineerFactory = new EngineerFactory();
        List<Engineer> engineerList = new ArrayList<>();
        engineerList.add(engineerFactory.getEngineerBySpeciality("design"));
        engineerList.add(engineerFactory.getEngineerBySpeciality("design"));
        engineerList.add(engineerFactory.getEngineerBySpeciality("design"));
        engineerList.add(engineerFactory.getEngineerBySpeciality("design"));
        engineerList.add(engineerFactory.getEngineerBySpeciality("electrical"));
        engineerList.add(engineerFactory.getEngineerBySpeciality("electrical"));
        engineerList.add(engineerFactory.getEngineerBySpeciality("electrical"));
        engineerList.add(engineerFactory.getEngineerBySpeciality("electrical"));

        for (Engineer engineer : engineerList) {
            engineer.working();
        }
    }
}
