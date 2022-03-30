package com.ciscoadiz;

public class FizzBuzzMain {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        MyText result;
        Number number;

        for (int i = 1; i < 101; i++) {
            number = new Number(i);
            result = fizzBuzz.getResponse(number);

            System.out.println(result);
        }
    }

}
