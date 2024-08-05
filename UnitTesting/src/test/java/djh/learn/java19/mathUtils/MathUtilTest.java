package djh.learn.java19.mathUtils;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MathUtilTest {

    MathUtil util;
    @BeforeAll
    static void beforeAll(){
        System.out.println("This is before all method");
    }

    @Test
    @Order(1)
    @DisplayName("Adding the Numbers")
    void add() {
        //given
        int x=5,y=7;
        //when
      //  MathUtil util = new MathUtil();
        int res = util.add(5,7);
        //then
        assertEquals(12,res);

    }

    @Test
    @Order(3)
    @DisplayName("Multiplying the Numbers")
    void mul() {
        int x=5,y=7;
        //when
      //  MathUtil util = new MathUtil();
        int res = util.mul(5,7);
        //then
        assertEquals(35,res);
    }

    @Test
    @Order(2)
    @DisplayName("Should return 8 when given 15 and 7")
    void sub() {
        int x=5,y=7;
        //when
      //  MathUtil util = new MathUtil();
        int res = util.sub(15,7);
        //then
        assertEquals(8,res);
    }

    @Test
    @Order(4)
    @DisplayName("should throw divide by zero")
    void testArea(){
      //  MathUtil util = new MathUtil();
        Executable executable = ()-> util.div(40,0);
        assertThrows(Exception.class,executable);
    }

    @Test
    @Order(5)
    @DisplayName("Dividing the numbers")
    void div() throws Exception {
        //when

        int res = util.div(150,3);
        //then
        assertEquals(50,res);
    }

    @AfterAll
    static void afterAll() throws InterruptedException {
        System.out.println("This is after all method");
    }

    @BeforeEach//set up
    void setUp() {
        util = new MathUtil();
        System.out.println("This is before each method");
    }

    @AfterEach//Tear Down
    void tearDown() {
        System.out.println("This is after each method");
    }

    @Disabled
    @Test
    @DisplayName("Number is Even")
    void isEven() {
        boolean res = util.isEven(50);
      //  assertTrue(res);
        boolean res2 = util.isEven(5);
     //   assertFalse(res2);
        assertAll(()->assertFalse(res2),()->assertTrue(res));
    }

    @Test
    @DisplayName("Return null")
    void divForNull() throws Exception {
        assertNull(util.divForNull(0,3));
    }
    @Test
    @DisplayName("Return Not null")
    void divForNotNull() throws Exception {
        assertNotNull(util.divForNull(10,3));
    }

    @Disabled
    @ParameterizedTest(name = "X={0},Y={1}")
    @CsvSource(value = {"11,4","3,12","3,20"})
    void addCSVSource(int x,int y) {
        assertEquals(15,util.add(x,y));
    }

    @Disabled
    @ParameterizedTest(name = "X={0}")
    @ValueSource(ints = {11,4,23,3})
    void addValueSource(int x) {
        assertTrue(util.isEven(x));
    }


    @ParameterizedTest(name = "X={0} Y={1}")
    @CsvFileSource(resources = "/add_test_data.csv",numLinesToSkip = 1)
    void addCsvFileSource(int x, int y) {
        assertEquals(9,util.add(x,y));
    }

    @Test
    void testFail(){
        fail("Method is failed");
    }

    @RepeatedTest(10)
    @Test
    void testRepeated(){
        assertTrue(util.random(10) <5);
    }

    @RepeatedTest(11109)
    @Test
    void testTimeOut(){
        assertTimeout(Duration.ofMillis(1),()->util.random(10) );
    }

    @Test
    void testAssertArray(){
        Integer[] arr ={3,4,5,6,7};
        int[] array = util.duplicateArray(arr);
        assertArrayEquals(new int[]{6,8,10,12,14},array);
    }

    @Test
    void testIterable(){
        List<Integer> list =List.of(3,4,5,6,7);
        List<Integer> theList = util.duplicateArray(list);
        assertIterableEquals(List.of(6,8,10,12,14),theList);
    }
}