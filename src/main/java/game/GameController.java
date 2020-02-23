package game;

public class GameController {

    public GameState input(Input input, GameState state) {
        final var gameStateFactory = new GameStateFactory();

        return gameStateFactory.getNewGame();
    }
}
