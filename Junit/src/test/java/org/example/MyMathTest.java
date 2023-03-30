package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MyMathTest {

    private MyMath myMath = new MyMath();

    @Test
    void calcSum_ThreeMemberArray() {

        assertEquals(6, myMath.calcSum(new int[] { 1, 2, 3 }));

    }

    @Test
    void calcSum_emptyArray() {

        assertEquals(0, myMath.calcSum(new int[] {}));

    }
}
