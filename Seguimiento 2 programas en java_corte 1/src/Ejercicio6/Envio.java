package Ejercicio6;

public class Envio {
    private String numeroGuia;
    private String fecha;
    private String tipoEmbalaje;
    private String cedulaCliente;
    private double peso;
    private String ciudadOrigen;
    private String ciudadDestino;
    private double costo;
    private String estadoEnvio;

    // constructor
    public Envio(String numeroGuia, String fecha, String tipoEmbalaje, String cedulaCliente,
                 double peso, String ciudadOrigen, String ciudadDestino, double costo, String estadoEnvio) {
        this.numeroGuia = numeroGuia;
        this.fecha = fecha;
        this.tipoEmbalaje = tipoEmbalaje;
        this.cedulaCliente = cedulaCliente;
        this.peso = peso;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.costo = costo;
        this.estadoEnvio = estadoEnvio;
    }

    // getters y Setters
    public String getNumeroGuia() {
        return numeroGuia;
    }

    public void setNumeroGuia(String numeroGuia) {
        this.numeroGuia = numeroGuia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipoEmbalaje() {
        return tipoEmbalaje;
    }

    public void setTipoEmbalaje(String tipoEmbalaje) {
        this.tipoEmbalaje = tipoEmbalaje;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getEstadoEnvio() {
        return estadoEnvio;
    }

    public void setEstadoEnvio(String estadoEnvio) {
        this.estadoEnvio = estadoEnvio;
    }

    // métodos
    public double calcularCostoXkilo() {
        return peso == 0 ? 0 : costo / peso; // Evitar división por cero
    }

    public boolean verificarEntrega() {
        return "Entregado".equals(estadoEnvio);
    }
}

class Main {
    public static void main(String[] args) {
        Envio envio = new Envio("12345", "2024-07-22", "Caja", "987654321", 10.5, "Armenia", "Quimbaya", 15000, "En tránsito");

        System.out.println("Costo por kilo: " + envio.calcularCostoXkilo());
        System.out.println("Estado de entrega: " + (envio.verificarEntrega() ? "Entregado" : "No entregado"));
    }
}
