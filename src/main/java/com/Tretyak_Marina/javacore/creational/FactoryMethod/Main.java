package main.java.com.Tretyak_Marina.javacore.creational.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        SpecialistFactory specialistFactory = createSpecialistByProfession("doctor");
        Specialist specialist = specialistFactory.createSpecialist();
        specialist.writeProfession();
    }
    public static SpecialistFactory createSpecialistByProfession(String profession) {
        if (profession.equalsIgnoreCase("doctor")) {
            return new DoctorSpecialistFactory();
        } else if (profession.equalsIgnoreCase("programmer")) {
            return new ProgrammerSpecialistFactory();
        } else {
            throw new RuntimeException(profession + " is unknown profession");
        }
    }
}
