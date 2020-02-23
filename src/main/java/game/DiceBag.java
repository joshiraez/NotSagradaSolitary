package game;

import util.RandomBag;

import java.util.Collection;

public class DiceBag {

    final RandomBag<ColorDice> bag;

    public DiceBag(Collection<ColorDice> dice) {
        bag = new RandomBag<>(dice);
    }

    public Collection<ColorDice> peekDice() {
        return bag.peek();
    }
}
