package Ejercicio20;

import java.util.Scanner;

class CeluMovil {
    private int cargoFijo;
    private int valorMinutoInternacional;
    private int valorPaqueteDatosServicio;

    // constructor que va a inicializar los valores según el operador
    public CeluMovil(String operador) {
        switch (operador.toLowerCase()) {
            case "tigo":
                this.cargoFijo = 45000;
                this.valorMinutoInternacional = 200;
                this.valorPaqueteDatosServicio = 12000;
                break;
            case "claro":
                this.cargoFijo = 30000;
                this.valorMinutoInternacional = 100;
                this.valorPaqueteDatosServicio = 18000;
                break;
            case "movistar":
                this.cargoFijo = 40000;
                this.valorMinutoInternacional = 250;
                this.valorPaqueteDatosServicio = 8000;
                break;
            default:
                throw new IllegalArgumentException("Operador no reconocido.");
        }
    }

    public int calcularCostoTotal(int minutosInternacionales, int valorPaqueteDatos) {
        return cargoFijo + (minutosInternacionales * valorMinutoInternacional) + valorPaqueteDatosServicio;
    }
}

class CeluMovilPromocion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el operador (Claro, Tigo, Movistar): ");
        String operador = scanner.nextLine();

        System.out.print("Ingrese el número de minutos internacionales: ");
        int minutosInternacionales = scanner.nextInt();

        System.out.print("Ingrese el valor del paquete de datos: ");
        int valorPaqueteDatos = scanner.nextInt();

        try {
            // crea una instancia de CeluMovil con el operador seleccionado
            CeluMovil celuMovil = new CeluMovil(operador);
            int costoTotal = celuMovil.calcularCostoTotal(minutosInternacionales, valorPaqueteDatos);
            System.out.printf("El costo total para el operador %s es: $%d%n", operador, costoTotal);
        } catch (IllegalArgumentException e) {
            // muestra un mensaje de error si el operador no está en la lista
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
