package main.java.com.Tretyak_Marina.javacore.behavioral.Chain;

public class Main {
    public static void main(String[] args) {
        Message logMessage = new LogMessage(Priority.LOG_MESSAGE);
        Message warning = new WarningMessage(Priority.WARNING);
        Message exception = new ExceptionMessage(Priority.ERROR);

        logMessage.setNextLevelMessage(warning);
        warning.setNextLevelMessage(exception);

        logMessage.throwMessage("Everything is okey", Priority.LOG_MESSAGE);
        logMessage.throwMessage("This place in code can be dangerous ", Priority.WARNING);
        logMessage.throwMessage("Code will not work", Priority.ERROR);
    }
}
