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
public class baleada {

    private String tortilla;
    private String ingredientes;
    private String precio;

    public baleada(String tortilla, String ingredientes, String precio) {
        this.tortilla = tortilla;
        this.ingredientes = ingredientes;
        this.precio = precio;
    }

    public baleada() {
    }

    public String getTortilla() {
        return tortilla;
    }

    public void setTortilla(String tortilla) {
        this.tortilla = tortilla;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return tortilla;
    }
}
