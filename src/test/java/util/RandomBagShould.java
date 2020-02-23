package util;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RandomBagShould {
    @Test
    void beInitializedWithGivenListContents() {
        //Given
        final var list = Lists.list(3, 10, 4);
        //When
        final RandomBag<Integer> randomBag = new RandomBag<>(list);
        //Then
        assertThat(randomBag.peek())
                .containsExactlyInAnyOrderElementsOf(list);
    }
}