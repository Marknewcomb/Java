package com.newcomb.java;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class appTest {
    @BeforeAll
    public static void setup(){
        System.out.println("Starting test cases");
    }
    @BeforeEach
    public void beforeEach(){
        System.out.println("This is before each test");
    }
    @Test
    public void addNumsTest(){
        System.out.println("Test running...");
        assert(true);
    }
    @ParameterizedTest
    @CsvSource({"100,200","200,300"})
    public void paramTest(int a,int b){
        System.out.println("More test running...");
        assertEquals(b,(a+100));
    }
    @AfterAll
    public static void after(){
        System.out.println("Ending test cases");
    }
}
