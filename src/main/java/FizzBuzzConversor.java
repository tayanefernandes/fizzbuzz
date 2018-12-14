public class FizzBuzzConversor {

    public String converter(int numero) {
        if(numero % 3 == 0) {
            return "Fizz";
        }

        if(numero % 5 == 0) {
            return "Buzz";
        }

        return String.valueOf(numero);
    }
}
