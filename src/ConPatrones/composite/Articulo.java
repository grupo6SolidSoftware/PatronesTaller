/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConPatrones.composite;

/**
 *
 * @author Administrador
 */
public class Articulo implements Comida{
    
    private String nombre;
    private String descripcion;
    private double precio;
    private String tipo;

    public Articulo(String nombre, String descripcion, double precio, String tipo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.tipo = tipo;
    }

    @Override
    public double getPrecio() {
        return precio;
    }
    
    public String toString(){
        return nombre;
    }
    
}
