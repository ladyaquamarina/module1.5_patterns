package main.java.com.Tretyak_Marina.javacore.behavioral.Command;

public class Main {
    public static void main(String[] args) {
        Project project = new Project();

        Developer developer = new Developer(
                new CreateCommand(project),
                new UpdateCommand(project),
                new DeleteCommand(project)
        );
        developer.createProject();
        developer.updateProject();
        developer.deleteProject();
    }
}
