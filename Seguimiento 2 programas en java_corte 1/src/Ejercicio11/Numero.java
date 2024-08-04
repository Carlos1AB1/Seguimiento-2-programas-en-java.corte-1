package Ejercicio11;

import java.util.Scanner;

class Numero {
    private int valor;

    // constructor
    public Numero(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String determinarParidad() {
        if (valor % 2 == 0) {
            return "El número es par.";
        } else {
            return "El número es impar.";
        }
    }
}

class DeterminarParidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int valor = scanner.nextInt();

        // crear una instancia de Numero usando el constructor
        Numero numero = new Numero(valor);

        // mostrar la paridad del número
        System.out.println(numero.determinarParidad());

        scanner.close();
    }
}
