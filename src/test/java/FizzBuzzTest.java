import com.ciscoadiz.FizzBuzz;
import com.ciscoadiz.MyText;
import com.ciscoadiz.Number;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();
    Number number;
    Number multiple;
    MyText newText;

    @Test
    public void shouldBeOne() {
        number = new Number(1);
        newText = fizzBuzz.getResponse(number);

        assertEquals("1", newText.getText());
    }

    @Test
    public void shouldBeMultiple() {
        number = new Number(3);
        multiple = new Number(3);

        assertTrue(fizzBuzz.isMultiple(number, multiple));
    }


    @Test
    public void shouldBeFizz(){
        number = new Number(3);
        newText = fizzBuzz.getResponse(number);

        assertEquals("Fizz", newText.getText());
    }

    @Test
    public void shouldBeBuzz(){
        number = new Number(5);
        newText = fizzBuzz.getResponse(number);
        assertEquals("Buzz",newText.getText());
    }

    @Test
    public void shouldBeFizzBuzz(){
        number = new Number(15);
        newText = fizzBuzz.getResponse(number);

        assertEquals("FizzBuzz", newText.getText());
    }

    @Test
    public void finalStackCallTest() {
        newText = fizzBuzz.getResponse(new Number(1));
        assertEquals("1", newText.getText());

        newText = fizzBuzz.getResponse(new Number(3));
        assertEquals("Fizz", newText.getText());

        newText = fizzBuzz.getResponse(new Number(5));
        assertEquals("Buzz", newText.getText());

        newText = fizzBuzz.getResponse(new Number(15));
        assertEquals("FizzBuzz", newText.getText());
    }
}
