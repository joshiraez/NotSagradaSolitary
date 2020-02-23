package game;

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static game.DiceColor.*;

public class DiceBagFactory {
    public DiceBag initialDiceBag() {
        return new DiceBag(
                getInitialDice()
        );
    }

    private Collection<ColorDice> getInitialDice() {
        return Stream.of(RED, YELLOW, BLUE, GREEN, PURPLE)
                .map(color -> getDice(18, color))
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    private Collection<ColorDice> getDice(int number, DiceColor color) {
        return Collections.nCopies(number, new ColorDice(color));
    }


}
