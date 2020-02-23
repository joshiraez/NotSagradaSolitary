import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GameStateFactoryShould {

    final GameStateFactory gameStateFactory = new GameStateFactory();

    @Test
    void createANewGameWithADiceBag() {
        //Given
        //When
        final var newGame = gameStateFactory.getNewGame();
        //Then
        assertThat(newGame)
                .extracting("diceBag").element(0)
                .isEqualTo(new DiceBagFactory().initialDiceBag());
    }
}