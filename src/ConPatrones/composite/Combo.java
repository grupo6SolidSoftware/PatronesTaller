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

    List<Comida> combos = new ArrayList<Comida>();

    public Combo() {

    }
   
    
    public void add(Comida comida) {
        this.combos.add(comida);
    }

    public void remove(Comida comida) {
        this.combos.remove(comida);
    }

    @Override
    public double getPrecio() {
        double precio = 0;
        for(Comida c: combos){
            precio +=c.getPrecio();
        }
        return precio;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Comida c: combos){
            sb.append(c).append(" ");
        }
        return sb.toString();
    }
    
}
