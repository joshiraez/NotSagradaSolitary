package game;

class GameStateFactory {

    GameState getNewGame() {
        final var diceBagFactory = new DiceBagFactory();

        return new GameState(
                diceBagFactory.initialDiceBag()
        );
    }
}
