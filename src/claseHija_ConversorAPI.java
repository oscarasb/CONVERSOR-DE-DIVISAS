import com.google.gson.JsonObject;

import java.io.IOException;

public class claseHija_ConversorAPI extends SUPERCLASE_BaseConversor {
    @Override
    public double convertir(String monedaOrigen, String monedaDestino, double cantidad) {
        try {
            JsonObject jsonObject = obtenerDatosAPI(monedaOrigen);
            double tasaCambio = jsonObject.getAsJsonObject("conversion_rates").get(monedaDestino).getAsDouble();
            return cantidad * tasaCambio;
        } catch (IOException e) {
            System.out.println("\uD83D\uDEAB\n ERROR AL OBTENER LOS DATOS DE LA API " + "\nVULEVA A INTENTARLO \uD83D\uDEAB\n" + e.getMessage());
            return 0.0;
        }
    }
}
