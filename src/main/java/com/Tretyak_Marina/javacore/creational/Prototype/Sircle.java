package main.java.com.Tretyak_Marina.javacore.creational.Prototype;

public class Sircle implements Copyable {
    private int radius;
    private int x;
    private int y;
    public Sircle(int radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public Object copy() {
        Sircle copy = new Sircle(radius, x, y);
        return copy;
    }

    @Override
    public String toString() {
        return "Sircle{" +
                "radius=" + radius +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
