package th2_Tach_Bien;

import org.junit.jupiter.api.Test;

import java.lang.annotation.Target;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void testFizz3(){
        int number = 3;
        String expected = "Fizz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    void testFizz5(){
        int number = 5;
        String expected = "Fizz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    void testFizz10(){
        int number = 10;
        String expected = "Fizz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    void testFizz30(){
        int number = 30;
        String expected = "Fizz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);
    }
}
