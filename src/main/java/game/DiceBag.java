package game;

import util.RandomBag;

import java.util.Collection;

class DiceBag {

    final RandomBag<ColorDice> bag;

    DiceBag(Collection<ColorDice> dice) {
        bag = new RandomBag<>(dice);
    }

    Collection<ColorDice> peekDice() {
        return bag.peek();
    }
}
