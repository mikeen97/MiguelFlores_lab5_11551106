/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_miguelflores_11551106;

/**
 *
 * @author Miguel Flores
 */
public class clientes {

    private String nombre;
    private String telefono;
    private double efectivo;
    private String direccion;

    public clientes() {
    }

    public clientes(String nombre, String telefono, double efectivo, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.efectivo = efectivo;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(double efectivo) {
        this.efectivo = efectivo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
