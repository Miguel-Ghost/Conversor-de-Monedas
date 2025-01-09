import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

public class ApiCliente {
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/a23cc7fb0aca6e8d5d059eed/latest/";

    public static double convertirMoneda(String from, String to, double amount) throws Exception {
        String requestUrl = API_URL + from;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(requestUrl))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();
        TipoCambio tipoCambio = gson.fromJson(response.body(), TipoCambio.class);

        Map<String, Double> rates = tipoCambio.getRates();
        if (rates.containsKey(to)) {
            return amount * rates.get(to);
        } else {
            throw new IllegalArgumentException("Moneda de destino no válida.");
        }
    }
}
