package util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// Data structure that holds a number of entities and
// lets you get one at random, peek at the bag and add to the bag.
public class RandomBag<T> {

    final List<T> bag;

    public RandomBag(Collection<T> initialDice) {
        bag = new ArrayList<>(initialDice);
    }

    public Collection<T> peek() {
        return new ArrayList<>(bag);
    }
}