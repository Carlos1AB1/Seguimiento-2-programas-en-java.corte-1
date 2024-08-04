package Ejercicio21;

import java.util.Scanner;

class SandwichOrder {
    // precios base
    private static final int PRECIO_PEQUENO = 6000;
    private static final int PRECIO_GRANDE = 12000;

    private static final int PRECIO_TOCINETA = 3000;
    private static final int PRECIO_PAVO = 3000;
    private static final int PRECIO_QUESO = 2500;

    private String tamaño;
    private boolean tieneTocineta;
    private boolean tienePavo;
    private boolean tieneQueso;

    // constructor para inicializar los valores
    public SandwichOrder(String tamaño, boolean tieneTocineta, boolean tienePavo, boolean tieneQueso) {
        this.tamaño = tamaño;
        this.tieneTocineta = tieneTocineta;
        this.tienePavo = tienePavo;
        this.tieneQueso = tieneQueso;
    }

    public int calcularCostoTotal() {
        int costoTamaño;
        int costoIngredientes = 0;

        if ("pequeño".equalsIgnoreCase(tamaño)) {
            costoTamaño = PRECIO_PEQUENO;
        } else if ("grande".equalsIgnoreCase(tamaño)) {
            costoTamaño = PRECIO_GRANDE;
        } else {
            throw new IllegalArgumentException("Tamaño no reconocido. Debe ser 'pequeño' o 'grande'.");
        }

        if (tieneTocineta) {
            costoIngredientes += PRECIO_TOCINETA;
        }
        if (tienePavo) {
            costoIngredientes += PRECIO_PAVO;
        }
        if (tieneQueso) {
            costoIngredientes += PRECIO_QUESO;
        }

        return costoTamaño + costoIngredientes;
    }
}

class SandwichOrderApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del sándwich (pequeño o grande): ");
        String tamaño = scanner.nextLine();

        System.out.print("¿Desea tocineta? (sí/no): ");
        boolean tieneTocineta = "sí".equalsIgnoreCase(scanner.nextLine());

        System.out.print("¿Desea pavo? (sí/no): ");
        boolean tienePavo = "sí".equalsIgnoreCase(scanner.nextLine());

        System.out.print("¿Desea queso? (sí/no): ");
        boolean tieneQueso = "sí".equalsIgnoreCase(scanner.nextLine());

        try {
            SandwichOrder sandwich = new SandwichOrder(tamaño, tieneTocineta, tienePavo, tieneQueso);
            int costoTotal = sandwich.calcularCostoTotal();
            System.out.printf("El valor total a pagar por su sándwich es: $%d%n", costoTotal);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
