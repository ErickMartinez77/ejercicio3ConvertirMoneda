package cambioMonedaTest;

import ejercicio3.Cambio;
import ejercicio3.ConvertirMoneda;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CambioMonedaTest {

    ConvertirMoneda convertirMoneda = Mockito.mock(ConvertirMoneda.class);
    @Test
    public void verifyCambioA(){
        Mockito.when(convertirMoneda.convert("dolares","bolivianos")).thenReturn(7);
        Cambio cambio = new Cambio(convertirMoneda);
        String actualResult = cambio.cambioMoneda(100,"dolares","bolivianos");
        String expectedResult = "700 bolivianos";
        Assertions.assertEquals(expectedResult,actualResult,"ERROR");
        Mockito.verify(convertirMoneda).convert("dolares","bolivianos");
    }

    @Test
    public void verifyCambioB(){
        Mockito.when(convertirMoneda.convert("bolivianos","dolares")).thenReturn(7);
        Cambio cambio = new Cambio(convertirMoneda);
        String actualResult = cambio.cambioMoneda(100,"bolivianos","dolares");
        String expectedResult = "14 dolares";
        Assertions.assertEquals(expectedResult,actualResult,"ERROR");
        Mockito.verify(convertirMoneda).convert("bolivianos","dolares");
    }

    @Test
    public void verifyCambioC(){
        Mockito.when(convertirMoneda.convert("bolivianos","dolares")).thenReturn(7);
        Cambio cambio = new Cambio(convertirMoneda);
        String actualResult = cambio.cambioMoneda(-100,"bolivianos","dolares");
        String expectedResult = "Cantidad incorrecta";
        Assertions.assertEquals(expectedResult,actualResult,"ERROR");
        Mockito.verify(convertirMoneda).convert("bolivianos","dolares");
    }
}
