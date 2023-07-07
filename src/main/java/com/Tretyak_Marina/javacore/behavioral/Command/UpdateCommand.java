package main.java.com.Tretyak_Marina.javacore.behavioral.Command;

public class UpdateCommand implements Command{
    Project project;

    public UpdateCommand(Project project) {
        this.project = project;
    }

    @Override
    public void execute() {
        project.update();
    }
}
