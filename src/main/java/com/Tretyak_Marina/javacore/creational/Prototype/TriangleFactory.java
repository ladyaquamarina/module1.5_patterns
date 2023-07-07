package main.java.com.Tretyak_Marina.javacore.creational.Prototype;

public class TriangleFactory {
    Triangle triangle;
    public TriangleFactory(Triangle triangle) {
        this.triangle = triangle;
    }
    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }
    Triangle cloneTriangle() {
        return (Triangle) triangle.copy();
    }
}
