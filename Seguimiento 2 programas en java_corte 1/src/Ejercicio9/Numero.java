package Ejercicio9;

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

    public String determinarSigno() {
        if (valor > 0) {
            return "El número es positivo.";
        } else if (valor < 0) {
            return "El número es negativo.";
        } else {
            return "El número es cero.";
        }
    }
}

class DeterminarSigno {
    public static void main(String[] args) {
        // crear una instancia de Numero usando el constructor
        Numero numero = new Numero(2);
        System.out.println(numero.determinarSigno());
    }
}
