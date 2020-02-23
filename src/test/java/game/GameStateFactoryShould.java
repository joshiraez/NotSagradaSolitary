package game;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class GameStateFactoryShould {

    final GameStateFactory gameStateFactory = new GameStateFactory();

    @Test
    void createANewGameWithADiceBag() {
        //Given
        //When
        final var newGame = gameStateFactory.getNewGame();
        //Then
        Assertions.assertThat(newGame)
                .extracting("diceBag").element(0)
                .isEqualTo(new DiceBagFactory().initialDiceBag());
    }
}