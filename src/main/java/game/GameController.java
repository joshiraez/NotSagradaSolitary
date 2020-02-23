package game;

class GameController {

    GameState input(Input input, GameState state) {
        final var gameStateFactory = new GameStateFactory();

        return gameStateFactory.getNewGame();
    }
}
