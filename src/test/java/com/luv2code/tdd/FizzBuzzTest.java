package com.luv2code.tdd;

import com.luv2code.junitdemo.DemoUtils;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FizzBuzzTest {

    FizzBuzz fizzBuzz;

    @BeforeEach
    void setupBeforeEach(){
        fizzBuzz = new FizzBuzz();
        //System.out.println("@BeforeEach executes before the execution of each test method");
    }


    @DisplayName("Divisible by Three")
    @Test
    @Order(1)
    void testDivisibleByThree(){

        //fail("Fail");
        String expected = "Fizz";
        assertEquals(expected, fizzBuzz.compute(3), "Should return Fizz");

    }

    @DisplayName("Divisible by Five")
    @Test
    @Order(2)
    void testDivisibleByFive(){

        String expected = "Buzz";
        assertEquals(expected, fizzBuzz.compute(5), "Should return Buzz");

    }

    @DisplayName("Divisible by Three And Five")
    @Test
    @Order(3)
    void testDivisibleByThreeAndFive(){

        String expected = "FizzBuzz";
        assertEquals(expected, fizzBuzz.compute(15), "Should return FizzBuzz");

    }
    @DisplayName("Not Divisible by Three And Five")
    @Test
    @Order(4)
    void testNotDivisibleByThreeAndFive(){


        int i = 7;
        String expected = i + "";
        assertEquals(i+"", fizzBuzz.compute(i), "Should return " + i);

    }


    @DisplayName("Testing with small data file")
    @ParameterizedTest(name = "value={0}, expected={1}")
    @Order(5)
    @CsvFileSource(resources = "/small-test-data.csv")
    void testSmallDataFile(int value, String expected){

        assertEquals(expected, fizzBuzz.compute(value));

    }
}
