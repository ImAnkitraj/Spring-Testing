package com.tekion.mockito;

public class SomeBusinessImpl {

    private DataService dataService;

    public SomeBusinessImpl(DataService dataService) {
        this.dataService = dataService;
    }

    public int findTheGreatest() {
        int[] data = dataService.retrieveAllData();
        int value = Integer.MIN_VALUE;
        for(int val: data) {
            value = Math.max(value, val);
        }
        return value;
    }
}

interface DataService {

    int[] retrieveAllData();
}