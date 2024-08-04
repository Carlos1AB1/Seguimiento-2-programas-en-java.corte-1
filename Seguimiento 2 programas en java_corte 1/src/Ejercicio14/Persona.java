package Ejercicio14;

import java.util.Scanner;

class Persona {
    private String genero;
    private int edad;

    // constructor
    public Persona(String genero, int edad) {
        this.genero = genero;
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int calcularAyuda() {
        if (genero.equalsIgnoreCase("femenino")) {
            if (edad > 50) {
                return 120000;
            } else if (edad >= 30) {
                return 100000;
            }
        } else if (genero.equalsIgnoreCase("masculino")) {
            return 40000;
        }
        return 0;
    }
}

class CalcularAyuda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el género de la persona (femenino/masculino): ");
        String genero = scanner.nextLine();

        System.out.print("Ingrese la edad de la persona: ");
        int edad = scanner.nextInt();

        // crear una instancia de Persona usando el constructor
        Persona persona = new Persona(genero, edad);

        int ayuda = persona.calcularAyuda();
        System.out.printf("El valor recibido mensual de ayuda es: $%d%n", ayuda);

        scanner.close();
    }
}
