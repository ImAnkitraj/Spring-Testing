package org.example;

import org.junit.jupiter.api.*;

public class MyBeforeAfterTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("beforeAll");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("AfterAll");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("before");
    }

    @AfterEach
    void afterEach() {
        System.out.println("after");
    }

    @Test
    void test1() {
        System.out.println("test1");

    }

    @Test
    void test2() {
        System.out.println("test2");

    }

    @Test
    void test3() {
        System.out.println("test3");

    }
}
