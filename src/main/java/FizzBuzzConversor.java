public class FizzBuzzConversor {

    public String converter(int numero) {
        String resultado = "";

        if(numero % 3 == 0) {
            resultado = resultado + "Fizz";
        }

        if(numero % 5 == 0) {
            resultado = resultado + "Buzz";
        }

        if(resultado.isEmpty()) {
            resultado =  resultado + String.valueOf(numero);
        }

        return resultado;
    }
}
