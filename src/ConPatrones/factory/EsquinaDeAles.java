package ConPatrones.factory;

import ConPatrones.composite.Articulo;
import ConPatrones.composite.Combo;
import ConPatrones.composite.Comida;

public class EsquinaDeAles implements AbstractFatory{
	
	public EsquinaDeAles() {
		
	}
	
	public Comida fabricarArrozConMenestraYPollo() {
            Combo c = new Combo();
            c.add(new Articulo("Arroz","",1,""));
            c.add(new Articulo("Menestra","",1,""));
            c.add(new Articulo("Pollo","",1,""));
            //ing nombre, String descripcion, double precio, String ti
            
            return c;
	}
	
	public Comida fabricarPolloAsado() {
            Combo c = new Combo();
            c.add(new Articulo("Pollo asado","",1,""));
            //ing nombre, String descripcion, double precio, String ti
            
            return c;
		
	}
	
	public Comida fabricarArrozConMenestra() {
            Combo c = new Combo();
            c.add(new Articulo("Arroz","",1,""));
            c.add(new Articulo("Menestra","",1,""));
            //ing nombre, String descripcion, double precio, String ti
            
            return c;

	}
	
}
