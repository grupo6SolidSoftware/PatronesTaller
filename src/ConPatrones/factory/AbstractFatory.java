/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConPatrones.factory;

import ConPatrones.composite.Articulo;
import ConPatrones.composite.Comida;

/**
 *
 * @author CltControl
 */
public interface AbstractFatory {

    Comida fabricarArrozConMenestraYPollo();

    Comida fabricarPolloAsado();

    Comida fabricarArrozConMenestra();
}
