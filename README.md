# Conversor de Monedas

## Descripción

El **Conversor de Monedas** es una aplicación Java que permite a los usuarios convertir valores entre diferentes monedas utilizando tasas de cambio actualizadas desde una API externa. Este proyecto se diseñó para ser intuitivo y fácil de usar, soportando tanto nombres como códigos ISO 4217 de monedas para realizar las conversiones.

## Funcionalidades

- **Conversión de monedas**: Convierte montos entre distintas monedas basándose en las tasas de cambio actualizadas.
- **Búsqueda por nombre o código**: Permite ingresar la moneda base y la moneda destino usando su nombre o código.
- **Validación de entradas**: Verifica que las monedas ingresadas sean válidas y estén soportadas.
- **Actualización dinámica de tasas de cambio**: Obtiene datos en tiempo real desde una API de tasas de cambio.

## Requisitos

Para ejecutar el proyecto, necesitas lo siguiente:

- **Java**: Versión 8 o superior.
- **Dependencias**:
  - [Gson](https://github.com/google/gson): Para manejar JSON.
- **Acceso a Internet**: Para conectarse a la API de tasas de cambio.

## Instalación

1. Clona este repositorio o descarga los archivos del proyecto:

   ```bash
   git clone https://github.com/Miguel-Ghost/Conversor-de-Monedas.git
   ```

2. Asegúrate de que las dependencias estén disponibles en tu proyecto. Si usas un administrador de dependencias como Maven, incluye `Gson` en tu archivo `pom.xml`:

   ```xml
   <dependency>
       <groupId>com.google.code.gson</groupId>
       <artifactId>gson</artifactId>
       <version>2.10.1</version>
   </dependency>
   ```

3. Compila y ejecuta el proyecto con tu entorno de desarrollo favorito o desde la terminal:

   ```bash
   javac Main.java
   java Main
   ```

## Uso

1. Al ejecutar la aplicación, selecciona la opción **Convertir moneda**.
2. Ingresa el nombre o código de la **moneda base** (ejemplo: `USD` o `Dólar estadounidense`).
3. Ingresa el nombre o código de la **moneda destino** (ejemplo: `EUR` o `Euro`).
4. Introduce el monto a convertir.
5. La aplicación mostrará el resultado de la conversión.

## Ejemplo de Ejecución

![image](https://github.com/user-attachments/assets/5470e2bb-ca63-4759-a5ab-237f131ca734)


## API Utilizada

La aplicación utiliza la API de [Exchange Rate API](https://www.exchangerate-api.com/) para obtener las tasas de cambio actualizadas.

## Estructura del Proyecto

- `Main.java`: Clase principal que gestiona el flujo del programa y la interacción con el usuario.
- `ApiCliente.java`: Clase que se conecta a la API y maneja las solicitudes HTTP.
- `TipoCambio.java`: Clase modelo para mapear los datos de respuesta de la API.
- `NombreMoneda.java`: Clase que almacena y maneja una lista de monedas soportadas.
