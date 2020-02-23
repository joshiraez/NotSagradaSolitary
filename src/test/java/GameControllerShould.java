import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GameControllerShould {

    @Test
    void createANewGameWhenANewGameInputIsHandled() {
        //Given
        final var gameController = new GameController();
        final var input = new Input(NotSagradaAction.NEW_GAME);
        //When
        final var newGame = gameController.input(input, null);
        //Then
        assertThat(newGame).isEqualToComparingFieldByFieldRecursively(new GameStateFactory().getNewGame());
    }
}