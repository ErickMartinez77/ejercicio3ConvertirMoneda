package ejercicio3;

public class Cambio {
    private String msg;
    ConvertirMoneda convertirMoneda;
    public Cambio(){
        convertirMoneda = new ConvertirMoneda();
    }

    public Cambio(ConvertirMoneda objetoMockeado){
        convertirMoneda=objetoMockeado;
    }

    public String cambioMoneda(int moneda, String origen, String destino){
        if (moneda< 0){
            msg ="Cantidad incorrecta";
        }else if(origen.contentEquals("dolares") && destino.contentEquals("bolivianos")){
            msg =moneda * convertirMoneda.convert(origen, destino) + " " + destino;
        } else if (origen.contentEquals("bolivianos") && destino.contentEquals("dolares")) {
            msg = moneda / convertirMoneda.convert(origen, destino) + " " + destino;
        }
        return msg;
    }


}
