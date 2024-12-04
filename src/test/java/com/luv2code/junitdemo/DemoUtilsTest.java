package com.luv2code.junitdemo;

import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.Simple.class)
//@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
//@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DemoUtilsTest {

    DemoUtils demoUtils;

    @BeforeEach
    void setupBeforeEach(){
        demoUtils = new DemoUtils();
        //System.out.println("@BeforeEach executes before the execution of each test method");
    }



    @Test
    @Order(0)
    // @DisplayName("Equals and Not Equals")
    void testEquals_AndNotEquals(){

        //System.out.println("Running test : testEqualsAndNotEquals");

        assertEquals(6, demoUtils.add(2, 4), "2+4 must be 6");
        assertNotEquals(6, demoUtils.add(1, 9),"1+9 must not be 6");
    }

    @Test
    @Order(2)
        // @DisplayName("Equals and Not Equals")
    void testMultiplication(){

        //System.out.println("Running test : testEqualsAndNotEquals");

        assertEquals(6, demoUtils.multiply(2, 3), "2*3 must be 6");
        assertNotEquals(6, demoUtils.add(1, 9),"1*9 must not be 6");
    }

    @Test
    @DisplayName("Null and Not Null")
    @Order(3)
    void testNullAndNotNull(){

        //System.out.println("Running test : testNullAndNotNull");

        String str1 = null;
        String str2 = "Amine";
        assertNull(demoUtils.checkNull(str1), "Should be null");
        assertNotNull(demoUtils.checkNull(str2), "Should not be null");
    }

    @Test
    @Order(5)
    void testSameOrNotSame(){
        String str1 = "Luv2Code";

        assertSame(demoUtils.getAcademyDuplicate(), demoUtils.getAcademy(), "Objects should refer to same object");
        assertNotSame(str1, demoUtils.getAcademy(), "Objects should not refer to same object");
    }
    @Test
    @Order(1)
    void testTrueFalse(){
        int gradeOne = 10;
        int gradeTwo = 5;

        assertTrue(demoUtils.isGreater(gradeOne, gradeTwo), "This should return true");
        assertFalse(demoUtils.isGreater(gradeTwo, gradeOne), "This should return false");
    }

    @Test
    void testArrayEquals(){
        String[] myArray = {"A", "B", "C"};
        assertArrayEquals(myArray, demoUtils.getFirstThreeLettersOfAlphabet(), "Arrays should be the same");

    }

    @Test
    void testIterableEquals(){
        List<String> myList = List.of("luv", "2", "code");

        assertIterableEquals(myList, demoUtils.getAcademyInList(), "Iterable should be the same");
    }

    @Test
    void testLinesMatch(){
        List<String> myList = List.of("luv", "2", "code");

        assertLinesMatch(myList, demoUtils.getAcademyInList(), "Lines should match");
    }

    @Test
    void testThrowException(){

        assertThrows(Exception.class, ()-> {
            demoUtils.throwException(-1);
        }, "Should throw an Exception.");
        assertDoesNotThrow(()-> demoUtils.throwException(9), "Should not throw an Exception.");
    }

    @Test
    void testTimeout(){

        assertTimeoutPreemptively(Duration.ofSeconds(3),()-> {
            demoUtils.checkTimeout();
        }, "method should execute in 3 seconds");

    }






//    @AfterEach
//    void tearDownAfterEach(){
//        System.out.println("@AfterEach Running after each test method");
//        System.out.println();
//    }
//
//
//    @BeforeAll
//    static void setupBeforeEachClass(){
//        System.out.println("@BeforeAll executes only once before all tests");
//    }
//
//    @AfterAll
//    static void tearDownAfterAll(){
//        System.out.println("@AfterAll executes only once after all tests");
//    }



}
