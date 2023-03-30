package com.tekion.mockito;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SomeBusinessImplStubTest {

    @Test
    void test() {
        SomeBusinessImpl someBusiness = new SomeBusinessImpl(new DataServiceStub());
        assertEquals(4, someBusiness.findTheGreatest());
    }
}


class DataServiceStub implements DataService {

    @Override
    public int[] retrieveAllData() {
        return new int[] {1,2,3,4};
    }
}