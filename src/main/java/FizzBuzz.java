import utils.FizzBuzzList;
import utils.FizzBuzzNumber;
import utils.FizzBuzzText;

public class FizzBuzz {
    FizzBuzzList results;

    public FizzBuzz() {
        this.results = new FizzBuzzList();
    }

    public FizzBuzzList getResults() {
        return results;
    }

    public FizzBuzzText calculateResult(FizzBuzzNumber number){
        FizzBuzzText numberText = new FizzBuzzText(""+number);
        FizzBuzzText result = new FizzBuzzText(""+number);
        
        if (is_multiple(number, new FizzBuzzNumber(3)) || numberText.contains("3")){
            result = new FizzBuzzText("Fizz");
        }

        if (is_multiple(number, new FizzBuzzNumber(5)) || numberText.contains("5")){
            result = result.contains("Fizz") ? new FizzBuzzText("FizzBuzz") : new FizzBuzzText("Buzz");
        }

        return  result;
    }

    private boolean is_multiple(FizzBuzzNumber number, FizzBuzzNumber multiple) {
        return number.getNumber() % multiple.getNumber() == 0;
    }


    public void run(FizzBuzzNumber quantity){
        for (FizzBuzzNumber i = new FizzBuzzNumber(1); i.getNumber() <  quantity.getNumber()+1; i.sum(1) ) {
            results.add(calculateResult(i));
        }
    }
}
