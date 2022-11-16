package tech.blackpearl.genmaths.vector.oned;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Vec1Test {

    @Test
    void shouldPlus() {
        assertAll(
                () -> assertEquals(new Vec1(1).plus(new Vec1(1)).x(), 2),
                () -> assertEquals(new Vec1(0.1).plus(new Vec1(0.1)).x(), 0.2),
                () -> assertEquals(new Vec1(-1).plus(new Vec1(-0.1)).x(), -1.1)
        );
    }
}
