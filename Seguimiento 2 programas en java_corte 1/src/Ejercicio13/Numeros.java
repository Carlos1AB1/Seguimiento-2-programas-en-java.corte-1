package Ejercicio13;

import java.util.Scanner;

class Numeros {
    private double numero1;
    private double numero2;
    private double numero3;

    // constructor
    public Numeros(double numero1, double numero2, double numero3) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getNumero3() {
        return numero3;
    }

    public void setNumero3(double numero3) {
        this.numero3 = numero3;
    }

    public double encontrarMayor() {
        double mayor = numero1;

        if (numero2 > mayor) {
            mayor = numero2;
        }

        if (numero3 > mayor) {
            mayor = numero3;
        }

        return mayor;
    }
}

class EncontrarMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Ingrese el tercer número: ");
        double numero3 = scanner.nextDouble();

        // crear una instancia de Numeros usando el constructor
        Numeros numeros = new Numeros(numero1, numero2, numero3);

        double mayor = numeros.encontrarMayor();
        System.out.printf("El número mayor es: %.2f%n", mayor);

        scanner.close();
    }
}
