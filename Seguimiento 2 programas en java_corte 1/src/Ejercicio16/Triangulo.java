package Ejercicio16;

import java.util.Scanner;

class Triangulo {
    private int angulo1;
    private int angulo2;
    private int angulo3;

    // constructor
    public Triangulo(int angulo1, int angulo2, int angulo3) {
        this.angulo1 = angulo1;
        this.angulo2 = angulo2;
        this.angulo3 = angulo3;
    }

    public int getAngulo1() {
        return angulo1;
    }

    public void setAngulo1(int angulo1) {
        this.angulo1 = angulo1;
    }

    public int getAngulo2() {
        return angulo2;
    }

    public void setAngulo2(int angulo2) {
        this.angulo2 = angulo2;
    }

    public int getAngulo3() {
        return angulo3;
    }

    public void setAngulo3(int angulo3) {
        this.angulo3 = angulo3;
    }

    public boolean esTrianguloValido() {
        return (angulo1 + angulo2 + angulo3) == 180;
    }
}

class VerificarTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer ángulo del triángulo: ");
        int angulo1 = scanner.nextInt();

        System.out.print("Ingrese el segundo ángulo del triángulo: ");
        int angulo2 = scanner.nextInt();

        System.out.print("Ingrese el tercer ángulo del triángulo: ");
        int angulo3 = scanner.nextInt();

        // cree una instancia de Triangulo usando el constructor
        Triangulo triangulo = new Triangulo(angulo1, angulo2, angulo3);

        if (triangulo.esTrianguloValido()) {
            System.out.println("El triángulo es válido.");
        } else {
            System.out.println("El triángulo no es válido.");
        }

        scanner.close();
    }
}
