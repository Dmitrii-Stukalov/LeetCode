package test;

import code.Solution2336.SmallestInfiniteSet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution2336Test {
    @Test
    void firstTest() {
        SmallestInfiniteSet set = new SmallestInfiniteSet();
        set.addBack(2);
        assertEquals(1, set.popSmallest());
        assertEquals(2, set.popSmallest());
        assertEquals(3, set.popSmallest());
        set.addBack(1);
        assertEquals(1, set.popSmallest());
        assertEquals(4, set.popSmallest());
        assertEquals(5, set.popSmallest());
    }
}