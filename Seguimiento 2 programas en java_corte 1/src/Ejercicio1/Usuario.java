package Ejercicio1;

import javax.swing.*;

// clase y atributos
public class Usuario {
    private String UsuarioBase;
    private String UsuarioIngresado;
    private String ClaveBase;
    private String ClaveIngresada;
    private boolean EstadoSistema;

    // constructor
    public Usuario(String usuarioBase, String claveBase) {
        this.UsuarioBase = usuarioBase;
        this.ClaveBase = claveBase;
        this.UsuarioIngresado = "";
        this.ClaveIngresada = "";
        this.EstadoSistema = false;
    }

    // getters y Setters
    public String getUsuarioBase() {
        return UsuarioBase;
    }

    public void setUsuarioBase(String usuarioBase) {
        UsuarioBase = usuarioBase;
    }

    public String getUsuarioIngresado() {
        return UsuarioIngresado;
    }

    public void setUsuarioIngresado(String usuarioIngresado) {
        UsuarioIngresado = usuarioIngresado;
    }

    public String getClaveBase() {
        return ClaveBase;
    }

    public void setClaveBase(String claveBase) {
        ClaveBase = claveBase;
    }

    public String getClaveIngresada() {
        return ClaveIngresada;
    }

    public void setClaveIngresada(String claveIngresada) {
        ClaveIngresada = claveIngresada;
    }

    public boolean isEstadoSistema() {
        return EstadoSistema;
    }

    public void setEstadoSistema(boolean estadoSistema) {
        EstadoSistema = estadoSistema;
    }

    // métodos
    public boolean validarEstado() {
        EstadoSistema = UsuarioBase.equals(UsuarioIngresado) && ClaveBase.equals(ClaveIngresada);
        return EstadoSistema;
    }

    public boolean permitirAcceso() {
        return validarEstado();
    }

    // método principal para probar
    public static void main(String[] args) {
        // Crear un objeto Usuario con datos base
        Usuario usuario = new Usuario("Carlos", "1234");

        // simulación de ingreso de datos
        usuario.setUsuarioIngresado(JOptionPane.showInputDialog("Ingrese un usuario: "));
        usuario.setClaveIngresada(JOptionPane.showInputDialog("Ingrese una clave: "));

        // validar estado y permitir acceso
        if (usuario.permitirAcceso()) {
            JOptionPane.showMessageDialog(null, "Acceso permitido.");
        } else {
            JOptionPane.showMessageDialog(null, "Acceso denegado.");
        }
    }
}
