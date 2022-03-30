import org.junit.Test;
import utils.FizzBuzzList;
import utils.FizzBuzzNumber;
import utils.FizzBuzzText;

import static org.testng.AssertJUnit.*;
public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();
    FizzBuzzText result;

    @Test
    public void if_receives_1_returns_1(){
        result = fizzBuzz.calculateResult(new FizzBuzzNumber(1));
        assertEquals("1", result.getText());
    }

    @Test
    public void if_receives_multiple_3_returns_Fizz(){
        result = fizzBuzz.calculateResult(new FizzBuzzNumber(3));

        assertEquals("Fizz", result.getText());

        result = fizzBuzz.calculateResult(new FizzBuzzNumber(6));
        assertEquals("Fizz", result.getText());
    }

    @Test
    public void if_receives_multiple_of_5_returns_Buzz(){
        result = fizzBuzz.calculateResult(new FizzBuzzNumber(5));
        assertEquals("Buzz",result.getText());

        result = fizzBuzz.calculateResult(new FizzBuzzNumber(10));
        assertEquals("Buzz", result.getText());
    }

    @Test
    public void if_receives_multiple_of_5_and_3_returns_FizzBuzz(){
        result = fizzBuzz.calculateResult(new FizzBuzzNumber(15));
        assertEquals("FizzBuzz", result.getText());
    }

    @Test 
    public void if_number_contains_3_returns_Fizz(){
        //numero que no es multiplo de 3 ni de 5 y tiene un 3
        result = fizzBuzz.calculateResult(new FizzBuzzNumber(73));
        assertEquals("Fizz", result.getText());
    }

    @Test 
    public void if_number_contains_5_returns_Fizz(){
        //numero que no es multiplo de 3 ni de 5 y tiene un 5
        result = fizzBuzz.calculateResult(new FizzBuzzNumber(572));
        assertEquals("Buzz", result.getText());
    }

    @Test
    public void fizzBuzz_get_first_100_numbers(){
        FizzBuzzNumber quantity = new FizzBuzzNumber(100);
        FizzBuzzList list = fizzBuzz.getResults();

        fizzBuzz.run(quantity);
        assertEquals(100, list.size());
    }



}
