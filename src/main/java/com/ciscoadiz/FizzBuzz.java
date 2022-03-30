package com.ciscoadiz;

public class FizzBuzz {

    public boolean isMultiple(Number number, Number multiple) {
        return number.getNumber() % multiple.getNumber() == 0;
    }

    public MyText getResponse(Number data) {

        MyText resultado = new MyText(data.toString());

        if (isMultiple(data, new Number(3))) {
            resultado.setText("Fizz");
        }

        if (isMultiple(data, new Number(5))) {
            resultado = resultado.equals(new MyText("Fizz")) ?
                    new MyText("FizzBuzz") : new MyText("Buzz");
        }

        return resultado;
    }
}