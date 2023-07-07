package main.java.com.Tretyak_Marina.javacore.creational.Prototype;

public class Main {
    public static void main(String[] args) {
        Sircle first = new Sircle(10, 1, 2);
        System.out.println(first);
        System.out.println();
        SircleFactory sircleFactory = new SircleFactory(first);
        Sircle second = sircleFactory.cloneSircle();
        System.out.println(second);

        System.out.println();

        Triangle t1 = new Triangle(1,2,3,4,5,6);
        System.out.println(t1);
        System.out.println();
        TriangleFactory triangleFactory = new TriangleFactory(t1);
        Triangle t2 = triangleFactory.cloneTriangle();
        System.out.println(t2);
    }
}
