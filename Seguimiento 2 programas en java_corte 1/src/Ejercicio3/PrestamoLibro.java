package Ejercicio3;

import javax.swing.*;

public class PrestamoLibro {
    private int codPrestamo;
    private String fechaPrestamo;
    private String nombreLibro;
    private int codigoUsuario;
    private int diasDePrestamo;
    private boolean estadoPrestamo;

    // constructor
    public PrestamoLibro(int codPrestamo, String fechaPrestamo, String nombreLibro, int codigoUsuario, int diasDePrestamo, boolean estadoPrestamo) {
        this.codPrestamo = codPrestamo;
        this.fechaPrestamo = fechaPrestamo;
        this.nombreLibro = nombreLibro;
        this.codigoUsuario = codigoUsuario;
        this.diasDePrestamo = diasDePrestamo;
        this.estadoPrestamo = estadoPrestamo;
    }

    // getters y Setters
    public int getCodPrestamo() {
        return codPrestamo;
    }

    public void setCodPrestamo(int codPrestamo) {
        this.codPrestamo = codPrestamo;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public int getDiasDePrestamo() {
        return diasDePrestamo;
    }

    public void setDiasDePrestamo(int diasDePrestamo) {
        this.diasDePrestamo = diasDePrestamo;
    }

    public boolean isEstadoPrestamo() {
        return estadoPrestamo;
    }

    public void setEstadoPrestamo(boolean estadoPrestamo) {
        this.estadoPrestamo = estadoPrestamo;
    }

    // métodos
    public void prestarLibro() {
        codPrestamo = 101;
        fechaPrestamo = "22 de julio del 2024";
        nombreLibro = JOptionPane.showInputDialog("Ingrese el nombre del libro");
        try {
            codigoUsuario = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es tu código de usuario?"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Código inválido, debe ser un número.");
            return;
        }
        diasDePrestamo = 3;
        estadoPrestamo = true;
    }

    public String consultarEstadoPrestamo() {
        return "Datos del Préstamo:\n" +
                "Código de préstamo: " + codPrestamo + "\n" +
                "Fecha del préstamo: " + fechaPrestamo + "\n" +
                "Nombre del libro: " + nombreLibro + "\n" +
                "Días prestado: " + diasDePrestamo + "\n" +
                "Estado del préstamo: " + (estadoPrestamo ? "Activo" : "Inactivo");
    }

    public static void main(String[] args) {
        // crear un préstamo con valores predeterminados
        PrestamoLibro libro = new PrestamoLibro(0, "", "", 0, 0, false);
        libro.prestarLibro();
        System.out.println(libro.consultarEstadoPrestamo());
    }
}
