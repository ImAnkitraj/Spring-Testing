package com.tekion.mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SomeBusinessImplMockAnnotationTest {

    @Mock
    private DataService dataService;

    @InjectMocks
    private SomeBusinessImpl someBusiness;
    @Test
    void test() {

        when(dataService.retrieveAllData())
                .thenReturn(new int[] {1,2,3,4});
        assertEquals(4, someBusiness.findTheGreatest());
    }
}


