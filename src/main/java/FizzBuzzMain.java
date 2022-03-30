import utils.FizzBuzzList;
import utils.FizzBuzzNumber;
import utils.FizzBuzzText;

public class FizzBuzzMain {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        FizzBuzzList list;

        FizzBuzzNumber quantity = new FizzBuzzNumber(100);

        fizzBuzz.run(quantity);

        list = fizzBuzz.getResults();
        for (FizzBuzzText result : list.getList()) {
            System.out.println(result);
        }

    }
}