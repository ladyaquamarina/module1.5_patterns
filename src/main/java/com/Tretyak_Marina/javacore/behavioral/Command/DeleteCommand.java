package main.java.com.Tretyak_Marina.javacore.behavioral.Command;

public class DeleteCommand implements Command{
    Project project;

    public DeleteCommand(Project project) {
        this.project = project;
    }

    @Override
    public void execute() {
        project.delete();
    }
}
