package main.java.com.Tretyak_Marina.javacore.behavioral.Command;

public class CreateCommand implements Command{
    Project project;

    public CreateCommand(Project project) {
        this.project = project;
    }

    @Override
    public void execute() {
        project.create();
    }
}
