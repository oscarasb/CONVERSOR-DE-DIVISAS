import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public abstract class SUPERCLASE_BaseConversor implements InterfaceConversor {


    protected static final String API_DIRECCION_URL = " https://v6.exchangerate-api.com/v6/XXXXXXXXXXX/latest/";

    protected JsonObject obtenerDatosAPI(String monedaDIVISA) throws IOException {
        URL url = new URL(API_DIRECCION_URL + monedaDIVISA);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        Scanner scanner = new Scanner(conn.getInputStream());
        String jsonStr = scanner.useDelimiter("\\A").next();
        scanner.close();

        return JsonParser.parseString(jsonStr).getAsJsonObject();
    }
}