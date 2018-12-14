import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzConversorTest {
    @Test
    public void converter_deveRetornarOProprio_quandoONumeroNaoEMultilploDeCincoNemTres() {
        FizzBuzzConversor conversor = new FizzBuzzConversor();

        String resultado = conversor.converter(1);
        assertThat(resultado, is("1"));

        resultado = conversor.converter(2);
        assertThat(resultado, is("2"));
    }

    @Test
    public void converter_deveRetornarFizz_quandoONumeroEMultiploDeTres(){
        FizzBuzzConversor conversor = new FizzBuzzConversor();

        String resultado = conversor.converter(6);
        assertThat(resultado, is("Fizz"));

    }

    @Test
    public void converter_deveRetornarBuzz_quandoONumeroEMultiploDeCinco() {
        FizzBuzzConversor conversor = new FizzBuzzConversor();

        String resultado = conversor.converter(5);

        assertThat(resultado, is("Buzz"));
    }
}
