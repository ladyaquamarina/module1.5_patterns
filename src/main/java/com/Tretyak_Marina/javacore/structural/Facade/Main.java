package main.java.com.Tretyak_Marina.javacore.structural.Facade;

public class Main {
    public static void main(String[] args) {
        PipelineManagement pipelineManagement = new PipelineManagement();
        pipelineManagement.timeToWork();
        System.out.println();
        pipelineManagement.timeToRest();
    }
}
