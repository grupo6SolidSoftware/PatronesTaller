/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConPatrones.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class Combo implements Comida{
    private String nombre;
    private String descripcion;
    private double precio;
    private String tipo; //Puede ser plato, bebida, botana, combo1, combo2, etc
    List<Comida> combos = new ArrayList<Comida>();

    public Combo(String nombre, String descripcion, double precio, String tipo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.tipo = tipo;
    }
   
    
    @Override
    public void add(Comida comida) {
        this.combos.add(comida);
    }

    @Override
    public void remove(Comida comida) {
        this.combos.remove(comida);
    }

    @Override
    public double getPrecio() {
        return this.precio;
    }
    
}
