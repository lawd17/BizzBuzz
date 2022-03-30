package kata.example;

public class FizzBuzzMain {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();

        for (int i = 1; i < 101; i++) {
            System.out.println(fizzBuzz.obtenerResultado(i));
        }
    }
}
