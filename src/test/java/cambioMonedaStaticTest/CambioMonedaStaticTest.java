package cambioMonedaStaticTest;

import ejercicio3.Cambio;
import ejercicio3.ConvertirMoneda;
import ejercicio3Static.CambioStatic;
import ejercicio3Static.ConvertirMonedaStatic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class CambioMonedaStaticTest {

    @BeforeAll
    public static void before(){
        MockedStatic<ConvertirMonedaStatic> mocked = Mockito.mockStatic(ConvertirMonedaStatic.class);
        mocked.when(()-> ConvertirMonedaStatic.convert("dolares","bolivianos")).thenReturn(7);
        mocked.when(()-> ConvertirMonedaStatic.convert("bolivianos","dolares")).thenReturn(7);
        mocked.when(()-> ConvertirMonedaStatic.convert("dolares","bolivianos")).thenReturn(7);
    }
    @Test
    public void verifyCambioA(){
        CambioStatic cambioStatic = new CambioStatic();
        Assertions.assertEquals("700 bolivianos",cambioStatic.cambioMoneda(100,"dolares","bolivianos"),"ERROR");
    }

    @Test
    public void verifyCambioB(){
        CambioStatic cambioStatic = new CambioStatic();
        Assertions.assertEquals("14 dolares",cambioStatic.cambioMoneda(100,"bolivianos","dolares"),"ERROR");
    }

    @Test
    public void verifyCambioC(){
        CambioStatic cambioStatic = new CambioStatic();
        Assertions.assertEquals("Cantidad incorrecta",cambioStatic.cambioMoneda(-100,"dolares","bolivianos"),"ERROR");
    }
}
