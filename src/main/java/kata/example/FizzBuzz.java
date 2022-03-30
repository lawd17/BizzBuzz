package kata.example;

public class FizzBuzz {

    public FizzBuzz() {
    }

    private boolean validarMultiplo(int numero, int multiplo){
        boolean esMultiplo = false;

        if ( numero % multiplo == 0){
            esMultiplo = true;
        }

        return esMultiplo;
    }

    public String obtenerResultado(int number){
        String resultado = "";

        if (validarMultiplo(number, 3)){//si es multiplo de 3
            resultado += "Fizz";
        }

        if (validarMultiplo(number, 5)){//si es multiplo de 3
            resultado += "Buzz";
        }

        if (!validarMultiplo(number, 3) && !validarMultiplo(number, 5)){//si no es multiplo de ninguno
            resultado = number + "";
        }

        return resultado;
    }

}
