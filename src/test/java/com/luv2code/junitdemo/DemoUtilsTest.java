package com.luv2code.junitdemo;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

//@DisplayNameGeneration(DisplayNameGenerator.Simple.class)
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
//@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
class DemoUtilsTest {

    DemoUtils demoUtils;

    @BeforeEach
    void setupBeforeEach(){
        demoUtils = new DemoUtils();
        System.out.println("@BeforeEach executes before the execution of each test method");
    }


    @AfterEach
    void tearDownAfterEach(){
        System.out.println("@AfterEach Running after each test method");
        System.out.println();
    }


    @BeforeAll
    static void setupBeforeEachClass(){
        System.out.println("@BeforeAll executes only once before all tests");
    }

    @AfterAll
    static void tearDownAfterAll(){
        System.out.println("@AfterAll executes only once after all tests");
    }

    @Test
    // @DisplayName("Equals and Not Equals")
    void testEquals_AndNotEquals(){

        System.out.println("Running test : testEqualsAndNotEquals");

        assertEquals(6, demoUtils.add(2, 4), "2+4 must be 6");
        assertNotEquals(6, demoUtils.add(1, 9),"1+9 must not be 6");
    }

    @Test
    // @DisplayName("Null and Not Null")
    void testNullAndNotNull(){

        System.out.println("Running test : testNullAndNotNull");

        String str1 = null;
        String str2 = "Amine";
        assertNull(demoUtils.checkNull(str1), "Should be null");
        assertNotNull(demoUtils.checkNull(str2), "Should not be null");
    }
}
