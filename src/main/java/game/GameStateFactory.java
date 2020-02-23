package game;

public class GameStateFactory {
    protected GameState getNewGame() {
        final var diceBagFactory = new DiceBagFactory();

        return new GameState(
                diceBagFactory.initialDiceBag()
        );
    }
}
