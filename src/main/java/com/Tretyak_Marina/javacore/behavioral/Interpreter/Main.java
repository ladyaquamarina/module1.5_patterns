package main.java.com.Tretyak_Marina.javacore.behavioral.Interpreter;

public class Main {
    public static void main(String[] args) {
        Expression isJavaNorCppDeveloper = getJavaNorCppExpression();
        System.out.println("Is Java nor C++ developer: " + isJavaNorCppDeveloper.interpret("Java"));
        System.out.println("Is Java nor C++ developer: " + isJavaNorCppDeveloper.interpret("C++"));
        System.out.println("Is Java nor C++ developer: " + isJavaNorCppDeveloper.interpret("Java C++"));
    }
    public static Expression getJavaNorCppExpression() {
        Expression java = new TerminalExpression("Java");
        Expression cpp = new TerminalExpression("C++");
        return new NorExpression(java, cpp);
    }
}
