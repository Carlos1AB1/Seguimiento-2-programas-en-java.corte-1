package Ejercicio19;

import java.util.Scanner;

class VerificadorModelo {

    private int[] modelosDefectuosos;

    // constructor que recibe una lista de modelos defectuosos
    public VerificadorModelo(int[] modelosDefectuosos) {
        this.modelosDefectuosos = modelosDefectuosos;
    }

    // método para verificar si el modelo es defectuoso
    public String verificarModelo(int numeroModelo) {
        for (int modelo : modelosDefectuosos) {
            if (modelo == numeroModelo) {
                return "El automóvil está defectuoso, llevar a garantía.";
            }
        }
        return "Su automóvil no está defectuoso.";
    }
}

class VerificarModeloAutomovil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // lista de modelos defectuosos
        int[] modelosDefectuosos = {119, 179, 221, 780};
        for (int i = 189; i <= 195; i++) {
            modelosDefectuosos = agregarElemento(modelosDefectuosos, i);
        }

        VerificadorModelo verificador = new VerificadorModelo(modelosDefectuosos);

        System.out.print("Ingrese el número de modelo de su automóvil: ");
        int numeroModelo = scanner.nextInt();

        String resultado = verificador.verificarModelo(numeroModelo);
        System.out.println(resultado);

        scanner.close();
    }

    // método para agregar un elemento a un array
    private static int[] agregarElemento(int[] array, int nuevoElemento) {
        int[] nuevoArray = new int[array.length + 1];
        System.arraycopy(array, 0, nuevoArray, 0, array.length);
        nuevoArray[array.length] = nuevoElemento;
        return nuevoArray;
    }
}
