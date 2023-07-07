package main.java.com.Tretyak_Marina.javacore.structural.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class EngineerFactory {
    private static final Map<String, Engineer> engineers = new HashMap<>();
    public Engineer getEngineerBySpeciality(String speciality) {
        Engineer engineer = engineers.get(speciality);
        if(engineer == null) {
            switch (speciality) {
                case "design":
                    System.out.println("Hiring Design engineer");
                    engineer = new DesignEngineer();
                    break;
                case "electrical":
                    System.out.println("Hiring Electrical engineer");
                    engineer = new ElecticalEngineer();
                    break;
            }
            engineers.put(speciality, engineer);
        }
        return engineer;
    }
}
