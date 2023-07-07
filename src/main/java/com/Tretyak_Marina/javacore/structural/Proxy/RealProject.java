package main.java.com.Tretyak_Marina.javacore.structural.Proxy;

public class RealProject implements Project{
    private String url;

    public RealProject(String url) {
        this.url = url;
        load();
    }

    private void load() {
        System.out.println("Loading project " + url + "...");
    }
    @Override
    public void run() {
        System.out.println("Running project " + url + "...");
    }
}
