package org.example;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class MyAssertTest {

    List<String> list = Arrays.asList("AWS","Oracle");
    @Test
    void test() {
        assertTrue(list.contains("AWS"),"Something");
        assertEquals(true, list.contains("AWS"), "some msg");
        assertArrayEquals(new int[]{2}, new int[]{1,2});
    }
}
