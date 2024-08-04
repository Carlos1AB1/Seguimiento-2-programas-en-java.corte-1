package Ejercicio15;

import java.util.Scanner;

class SuscripcionGimnasio {
    private int dias;

    // constructor
    public SuscripcionGimnasio(int dias) {
        this.dias = dias;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int calcularCosto() {
        if (dias == 15) {
            return 18000;
        } else if (dias == 30) {
            return 35000;
        } else if (dias == 90) {
            return 86000;
        } else {
            return 0;
        }
    }
}

class CalcularCostoGimnasio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la duración de la suscripción en días (15, 30, o 90): ");
        int dias = scanner.nextInt();

        // crear una instancia de SuscripcionGimnasio usando el constructor
        SuscripcionGimnasio suscripcion = new SuscripcionGimnasio(dias);

        int costo = suscripcion.calcularCosto();
        if (costo > 0) {
            System.out.printf("El costo de la suscripción es: $%d%n", costo);
        } else {
            System.out.println("Duración no válida. Ingrese 15, 30, o 90 días.");
        }

        scanner.close();
    }
}
