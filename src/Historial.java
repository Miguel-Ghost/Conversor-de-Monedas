import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Historial {
    private final List<String> registros = new ArrayList<>();
    private static final String ARCHIVO_HISTORIAL = "historial.txt";


    public void agregar(String entrada) {
        registros.add(entrada);
    }


    public void mostrar() {
        if (registros.isEmpty()) {
            System.out.println("El historial está vacío.");
        } else {
            System.out.println("\nHistorial de conversiones:");
            for (String registro : registros) {
                System.out.println("- " + registro);
            }
        }
    }


    public void guardar() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_HISTORIAL))) {
            for (String registro : registros) {
                writer.write(registro);
                writer.newLine();
            }
            System.out.println("Historial guardado en '" + ARCHIVO_HISTORIAL + "'.");
        } catch (IOException e) {
            System.out.println("Error al guardar el historial: " + e.getMessage());
        }
    }


    public void cargar() {
        File archivo = new File(ARCHIVO_HISTORIAL);
        if (archivo.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
                String linea;
                while ((linea = reader.readLine()) != null) {
                    registros.add(linea);
                }
                System.out.println("Historial cargado desde '" + ARCHIVO_HISTORIAL + "'.");
            } catch (IOException e) {
                System.out.println("Error al cargar el historial: " + e.getMessage());
            }
        } else {
            System.out.println("No se encontró un historial previo.");
        }
    }
}
