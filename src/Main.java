import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Conversor de Monedas");

        while (true) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Convertir moneda");
            System.out.println("2. Salir");
            System.out.print("Opción: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consumir la línea restante

            switch (option) {
                case 1 -> {
                    // Buscar moneda base
                    System.out.print("Ingrese el código o nombre de la moneda base (ej: USD o Dólar estadounidense): ");
                    String baseInput = scanner.nextLine();
                    String baseCode = buscarCodigoMoneda(baseInput);
                    if (baseCode == null) {
                        System.out.println("Moneda base no encontrada.");
                        continue;
                    }

                    // Buscar moneda destino
                    System.out.print("Ingrese el código o nombre de la moneda destino (ej: EUR o Euro): ");
                    String targetInput = scanner.nextLine();
                    String targetCode = buscarCodigoMoneda(targetInput);
                    if (targetCode == null) {
                        System.out.println("Moneda destino no encontrada.");
                        continue;
                    }

                    // Ingresar monto
                    System.out.print("Ingrese el monto a convertir: ");
                    double amount = scanner.nextDouble();

                    // Realizar la conversión
                    try {
                        double result = ApiCliente.convertirMoneda(baseCode, targetCode, amount);
                        System.out.printf("Resultado: %.2f %s equivalen a %.2f %s%n", amount, baseCode, result, targetCode);
                    } catch (Exception e) {
                        System.out.println("Error durante la conversión: " + e.getMessage());
                    }
                }
                case 2 -> {
                    System.out.println("Saliendo... ¡Gracias por usar el conversor!");
                    return;
                }
                default -> System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    private static String buscarCodigoMoneda(String input) {
        // Busca el código a partir del nombre o código de la moneda
        if (input.length() == 3) {
            // Asumimos que es un código
            return NombreMoneda.getNameByCode(input).equals("Código no encontrado") ? null : input.toUpperCase();
        } else {
            // Asumimos que es un nombre
            return NombreMoneda.getCodeByName(input).equals("Nombre no encontrado") ? null : NombreMoneda.getCodeByName(input);
        }
    }
}
