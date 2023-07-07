package main.java.com.Tretyak_Marina.javacore.structural.Facade;

public class PipelineManagement {
    Job job = new Job();
    Worker worker = new Worker();
    Pipeline pipeline = new Pipeline();
    public void timeToWork() {
        job.startDoJob();
        pipeline.startMoving();
        worker.doJobWhileWorkTime(pipeline);
    }
    public void timeToRest() {
        pipeline.stopMoving();
        worker.doJobWhileWorkTime(pipeline);
        job.stopDoJob();
    }
}
