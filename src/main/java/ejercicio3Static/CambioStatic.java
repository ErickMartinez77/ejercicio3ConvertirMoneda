package ejercicio3Static;

public class CambioStatic {
    private String msg;
    public String cambioMoneda(int moneda, String origen, String destino){
        if (moneda< 0){
            msg ="Cantidad incorrecta";
        }else if(origen.contentEquals("dolares") && destino.contentEquals("bolivianos")){
            msg =moneda * ConvertirMonedaStatic.convert(origen, destino) + " " + destino;
        } else if (origen.contentEquals("bolivianos") && destino.contentEquals("dolares")) {
            msg = moneda / ConvertirMonedaStatic.convert(origen, destino) + " " + destino;
        }
        return msg;
    }
}
