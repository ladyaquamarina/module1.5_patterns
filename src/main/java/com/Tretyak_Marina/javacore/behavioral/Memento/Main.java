package main.java.com.Tretyak_Marina.javacore.behavioral.Memento;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Game game = new Game();
        SteamCloud steamCloud = new SteamCloud();

        System.out.println("Starting new game. Level 0");
        game.setGameSaving("Level 0");

        System.out.println(game);

        System.out.println("Saving current game progress to Steam Cloud");
        steamCloud.setSave(game.save());

        Thread.sleep(5000);

        System.out.println("Continuing playing game");
        System.out.println("Getting level 2");

        game.setGameSaving("Level 2");
        System.out.println(game);
        System.out.println("Losing staff the battle with the NPCs");

        System.out.println("Rolling back to previous saving");
        game.load(steamCloud.getSave());

        System.out.println("Game after rollback:");
        System.out.println(game);
    }
}
