package main.java.com.Tretyak_Marina.javacore.creational.Singleton;

public class SingleClass {
    private static SingleClass singleClass;
    private static String logFile = "This is log file\n\n";
    public static synchronized SingleClass getSingleClass() {
        if (singleClass == null) {
            singleClass = new SingleClass();
        }
        return singleClass;
    }
    private SingleClass() {}
    public void addToLogFile(String log) {
        logFile += log + "\n";
    }
    public void showLogFile() {
        System.out.println(logFile);
    }
}
