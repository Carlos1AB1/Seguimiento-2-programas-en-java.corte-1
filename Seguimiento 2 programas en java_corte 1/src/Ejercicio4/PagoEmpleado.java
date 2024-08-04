package Ejercicio4;

public class PagoEmpleado {
    private int codEmpleado;
    private double salarioBasico;
    private double horasExtras;
    private int numeroHoras;
    private double descuento;
    private double descuentoPrestamo;
    private double bonificacion;
    private double neto;

    // constructor
    public PagoEmpleado(int codEmpleado, double salarioBasico, double horasExtras, int numeroHoras, double descuento, double descuentoPrestamo, double bonificacion) {
        this.codEmpleado = codEmpleado;
        this.salarioBasico = salarioBasico;
        this.horasExtras = horasExtras;
        this.numeroHoras = numeroHoras;
        this.descuento = descuento;
        this.descuentoPrestamo = descuentoPrestamo;
        this.bonificacion = bonificacion;
        this.neto = calcularNeto(); // inicar el neto al crear el objeto
    }

    // getters y Setters
    public int getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(int codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public double getSalarioBasico() {
        return salarioBasico;
    }

    public void setSalarioBasico(double salarioBasico) {
        this.salarioBasico = salarioBasico;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getDescuentoPrestamo() {
        return descuentoPrestamo;
    }

    public void setDescuentoPrestamo(double descuentoPrestamo) {
        this.descuentoPrestamo = descuentoPrestamo;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    public double getNeto() {
        return neto;
    }

    public void setNeto(double neto) {
        this.neto = neto;
    }

    // métodos
    public double calcularValorHE() {
        // calcula el valor de las horas extras
        return horasExtras * numeroHoras;
    }

    public double calcularDevengado() {
        // calcula el salario devengado
        return salarioBasico + calcularValorHE() + bonificacion;
    }

    public double calcularDeducido() {
        // calcula el total deducido (descuento + descuentoPrestamo)
        return descuento + descuentoPrestamo;
    }

    public double calcularNeto() {
        // calcular el salario neto
        return calcularDevengado() - calcularDeducido();
    }

    // método principal para probar la clase
    public static void main(String[] args) {
        // crear un empleado con valores predeterminados
        PagoEmpleado empleado = new PagoEmpleado(1, 1000, 10, 5, 50, 30, 100);

        // mostrar los datos del empleado
        System.out.println("Código de Empleado: " + empleado.getCodEmpleado());
        System.out.println("Salario Básico: " + empleado.getSalarioBasico());
        System.out.println("Horas Extras: " + empleado.getHorasExtras());
        System.out.println("Número de Horas: " + empleado.getNumeroHoras());
        System.out.println("Descuento: " + empleado.getDescuento());
        System.out.println("Descuento Préstamo: " + empleado.getDescuentoPrestamo());
        System.out.println("Bonificación: " + empleado.getBonificacion());
        System.out.println("Salario Neto: " + empleado.getNeto());
    }
}
