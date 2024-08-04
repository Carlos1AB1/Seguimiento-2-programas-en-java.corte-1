package Ejercicio7;

public class Reclamo {
    private String numeroReclamo;
    private String nombrePersona;
    private String asunto;
    private String descripcionReclamo;
    private String estadoReclamo;

    // constructor
    public Reclamo(String numeroReclamo, String nombrePersona, String asunto, String descripcionReclamo, String estadoReclamo) {
        this.numeroReclamo = numeroReclamo;
        this.nombrePersona = nombrePersona;
        this.asunto = asunto;
        this.descripcionReclamo = descripcionReclamo;
        this.estadoReclamo = estadoReclamo;
    }

    public String getNumeroReclamo() {
        return numeroReclamo;
    }

    public void setNumeroReclamo(String numeroReclamo) {
        this.numeroReclamo = numeroReclamo;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getDescripcionReclamo() {
        return descripcionReclamo;
    }

    public void setDescripcionReclamo(String descripcionReclamo) {
        this.descripcionReclamo = descripcionReclamo;
    }

    public String getEstadoReclamo() {
        return estadoReclamo;
    }

    public void setEstadoReclamo(String estadoReclamo) {
        this.estadoReclamo = estadoReclamo;
    }

    public boolean validarEstadoReclamo() {
        // implementar lógica de validación aquí
        return "Pendiente".equals(estadoReclamo) || "Resuelto".equals(estadoReclamo); // Ejemplo de validación
    }

    public String mensajeRecepcionReclamo() {
        return "Reclamo recibido: " + numeroReclamo + " - " + asunto;
    }
}

class Main {
    public static void main(String[] args) {
        // crear una instancia de Reclamo usando el constructor
        Reclamo reclamo = new Reclamo("R12345", "Juan Pérez", "Producto defectuoso", "El producto recibido está defectuoso y no funciona correctamente.", "Pendiente");

        System.out.println(reclamo.mensajeRecepcionReclamo());
        System.out.println("Estado del reclamo válido: " + reclamo.validarEstadoReclamo());
    }
}
