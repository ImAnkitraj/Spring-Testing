package com.tekion.mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

public class SomeBusinessImplMockTest {

    @Test
    void test() {

        DataService dataServiceMock = mock(DataService.class);
        when(dataServiceMock.retrieveAllData())
                .thenReturn(new int[] {1,2,3,4});
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(dataServiceMock);
        assertEquals(4, someBusiness.findTheGreatest());
    }
}


