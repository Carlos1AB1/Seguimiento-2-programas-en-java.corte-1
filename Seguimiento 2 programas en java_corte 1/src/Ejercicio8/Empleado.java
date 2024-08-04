package Ejercicio8;

class Empleado {

    private String nombre;
    private int horasTrabajadas;
    private int salario;

    // constructor
    public Empleado(String nombre, int horasTrabajadas) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        calcularSalario(); // calcular el salario al momento de crear el objeto
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
        calcularSalario();
    }

    public int getSalario() {
        return salario;
    }

    private void calcularSalario() {
        if (horasTrabajadas <= 10) {
            salario = horasTrabajadas * 30000;
        } else {
            salario = (10 * 30000) + ((horasTrabajadas - 10) * 33000);
        }
    }
}

class CalculadoraSalario {
    public static void main(String[] args) {
        // crear una instancia de Empleado usando el constructor
        Empleado empleado = new Empleado("Arle", 15);

        // mostrar el mensaje
        System.out.println("Señor " + empleado.getNombre() + ", el número de horas trabajadas es " + empleado.getHorasTrabajadas() + " y su salario equivale a " + empleado.getSalario());
    }
}
