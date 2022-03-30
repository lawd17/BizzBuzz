package kata.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void shouldReturn1() {
        assertEquals(fizzBuzz.obtenerResultado(1), "1");
    }

    @Test
    void shouldReturnFizz() {
        assertEquals(fizzBuzz.obtenerResultado(3), "Fizz");
    }

    @Test
    void shouldReturnBuzz() {
        assertEquals(fizzBuzz.obtenerResultado(5), "Buzz");
    }

    @Test
    void shouldReturnFizzBuzz() {
        assertEquals(fizzBuzz.obtenerResultado(15), "FizzBuzz");
    }


}