package Ejercicio17;

import java.util.Scanner;

class Fotocopiadora {
    // constructor vacío
    public Fotocopiadora() {
    }

    public double calcularPrecioPorCopia(int cantidadCopias) {
        if (cantidadCopias >= 0 && cantidadCopias <= 499) {
            return 120;
        } else if (cantidadCopias >= 500 && cantidadCopias <= 749) {
            return 100;
        } else if (cantidadCopias >= 750 && cantidadCopias <= 999) {
            return 80;
        } else if (cantidadCopias >= 1000) {
            return 50;
        } else {
            return 0;
        }
    }

    public double calcularCostoTotal(int cantidadCopias) {
        double precioPorCopia = calcularPrecioPorCopia(cantidadCopias);
        return precioPorCopia * cantidadCopias;
    }
}

class CalcularCostoImpresion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // crear una instancia de Fotocopiadora usando el constructor
        Fotocopiadora fotocopiadora = new Fotocopiadora();

        System.out.print("Ingrese la cantidad de copias que desea imprimir: ");
        int cantidadCopias = scanner.nextInt();

        double precioPorCopia = fotocopiadora.calcularPrecioPorCopia(cantidadCopias);
        double costoTotal = fotocopiadora.calcularCostoTotal(cantidadCopias);

        System.out.printf("Precio por copia: $%.2f%n", precioPorCopia);
        System.out.printf("Costo total: $%.2f%n", costoTotal);

        scanner.close();
    }
}
