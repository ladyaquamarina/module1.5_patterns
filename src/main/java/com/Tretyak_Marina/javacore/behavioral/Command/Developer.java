package main.java.com.Tretyak_Marina.javacore.behavioral.Command;

public class Developer {
    private Command create;
    private Command update;
    private Command delete;

    public Developer(Command create, Command update, Command delete) {
        this.create = create;
        this.update = update;
        this.delete = delete;
    }
    public void createProject() {
        create.execute();
    }
    public void updateProject() {
        update.execute();
    }
    public void deleteProject() {
        delete.execute();
    }
}
