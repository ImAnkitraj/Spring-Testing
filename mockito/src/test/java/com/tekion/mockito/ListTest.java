package com.tekion.mockito;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import java.util.List;

public class ListTest {

    @Test
    void test() {
        List listMock  = mock(List.class);
        when(listMock.size()).thenReturn(3);
        assertEquals(3, listMock.size());
    }

    @Test
    void test2() {
        List listMock  = mock(List.class);
        when(listMock.size()).thenReturn(3).thenReturn(1);
        assertEquals(3, listMock.size());
        assertEquals(1, listMock.size());
        assertEquals(1, listMock.size());
    }

    @Test
    void test3() {
        List listMock  = mock(List.class);
        when(listMock.get(0)).thenReturn("SomeSring");
        assertEquals("SomeSring", listMock.get(0));
        assertEquals(null, listMock.get(1));

    }

    @Test
    void test4() {
        List listMock  = mock(List.class);
        when(listMock.get(Mockito.anyInt())).thenReturn("SomeString");
        assertEquals("SomeString", listMock.get(0));
        assertEquals("SomeString", listMock.get(1));

    }
}
