package Ejercicio18;

import java.util.Scanner;

class Computadora {
    private boolean emitePitido;
    private boolean discoGira;

    // constructor que inicializa los atributos
    public Computadora(boolean emitePitido, boolean discoGira) {
        this.emitePitido = emitePitido;
        this.discoGira = discoGira;
    }

    public boolean isEmitePitido() {
        return emitePitido;
    }

    public void setEmitePitido(boolean emitePitido) {
        this.emitePitido = emitePitido;
    }

    public boolean isDiscoGira() {
        return discoGira;
    }

    public void setDiscoGira(boolean discoGira) {
        this.discoGira = discoGira;
    }

    public String verificarEstado() {
        if (emitePitido) {
            if (discoGira) {
                return "Póngase en contacto con el técnico de apoyo.";
            } else {
                return "Verificar contactos de la unidad.";
            }
        } else {
            if (discoGira) {
                return "Compruebe las conexiones de altavoces.";
            } else {
                return "Traiga la computadora para repararla en la central.";
            }
        }
    }
}

class ResolverProblemaComputadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // obtener el estado del pitido
        System.out.print("¿La computadora emite un pitido al iniciarse? (sí/no): ");
        String respuestaPitido = scanner.nextLine().trim().toLowerCase();

        // obtener el estado del disco duro
        System.out.print("¿El disco duro gira? (sí/no): ");
        String respuestaDisco = scanner.nextLine().trim().toLowerCase();

        // crear una instancia de Computadora usando el constructor
        Computadora computadora = new Computadora(
                respuestaPitido.equals("sí"),
                respuestaDisco.equals("sí")
        );

        // verificar el estado y mostrar el resultado
        String estado = computadora.verificarEstado();
        System.out.println(estado);

        scanner.close();
    }
}
