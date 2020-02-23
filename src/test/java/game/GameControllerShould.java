package game;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class GameControllerShould {

    @Test
    void createANewGameWhenANewGameInputIsHandled() {
        //Given
        final var gameController = new GameController();
        final var input = new Input(Action.NEW_GAME);
        //When
        final var newGame = gameController.input(input, null);
        //Then
        Assertions.assertThat(newGame).isEqualToComparingFieldByFieldRecursively(new GameStateFactory().getNewGame());
    }
}