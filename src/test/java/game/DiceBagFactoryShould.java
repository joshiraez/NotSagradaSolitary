package game;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.Condition;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static game.DiceColor.*;
import static java.util.stream.Stream.of;
import static org.assertj.core.api.Assertions.allOf;

class DiceBagFactoryShould {

    final DiceBagFactory diceBagFactory = new DiceBagFactory();

    @Test
    void initializeABagWith18OfEveryColorDice() {
        //Given
        //When
        final var diceBag = diceBagFactory.initialDiceBag();
        //Then
        Assertions.assertThat(diceBag.peekDice())
                .extracting(ColorDice::getColor)
                .has(
                        allOf(
                                of(RED, YELLOW, GREEN, BLUE, PURPLE)
                                        .map(color -> hasDice(18, color))
                                        .collect(Collectors.toUnmodifiableList())
                        )
                );
    }

    private Condition<? super List<? extends DiceColor>> hasDice(int number, DiceColor color) {
        return new Condition<>(
                diceColors -> diceColors
                        .stream()
                        .filter(color::equals)
                        .count() == number,
                "" + number + color
        );
    }
}