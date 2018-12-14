public class FizzBuzzConversor {

    public String converter(int numero) {
        if(numero % 3 == 0) {
            return "Fizz";
        }

        return String.valueOf(numero);
    }
}
