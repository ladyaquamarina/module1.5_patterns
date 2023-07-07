package main.java.com.Tretyak_Marina.javacore.creational.FactoryMethod;

public class DoctorSpecialistFactory implements SpecialistFactory{
    @Override
    public Specialist createSpecialist() {
        return new Doctor();
    }
}
