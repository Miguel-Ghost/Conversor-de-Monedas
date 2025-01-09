import com.google.gson.Gson;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        try {

            String jsonResponse = ApiCliente.convertirMoneda();
            Gson gson = new Gson();
            TipoCambio rates = gson.fromJson(jsonResponse, TipoCambio.class);

            System.out.println("Monedas disponibles: " + rates.getRates().keySet());


            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese la moneda de origen: ");
            String fromCurrency = scanner.nextLine().toUpperCase();

            System.out.print("Ingrese la moneda de destino: ");
            String toCurrency = scanner.nextLine().toUpperCase();

            System.out.print("Ingrese la cantidad a convertir: ");
            double amount = scanner.nextDouble();


            if (rates.getRates().containsKey(fromCurrency) && rates.getRates().containsKey(toCurrency)) {
                double fromRate = rates.getRates().get(fromCurrency);
                double toRate = rates.getRates().get(toCurrency);
                double convertedAmount = (amount / fromRate) * toRate;

                System.out.printf("La cantidad convertida es: %.2f %s\n", convertedAmount, toCurrency);
            } else {
                System.out.println("Moneda no válida. Intente de nuevo.");
            }
        } catch (Exception e) {
            System.out.println("Error al realizar la conversión: " + e.getMessage());
        }
    }

}
