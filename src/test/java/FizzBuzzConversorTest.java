import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzConversorTest {
    @Test
    public void converter_deveRetornarOProprio_quandoEleNaoEMultilploDeCincoNemTres() {
        FizzBuzzConversor conversor = new FizzBuzzConversor();

        String resultado = conversor.converter(1);
        assertThat(resultado, is("1"));

        resultado = conversor.converter(2);
        assertThat(resultado, is("2"));
    }
}
