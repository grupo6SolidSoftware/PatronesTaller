package ConPatrones;

public class EsquinaDeAles implements AbstractFatory{
	
	public EsquinaDeAles() {
		
	}
	
	public Articulo fabricarArrozConMenestraYPollo() {
		Articulo articulo = new Articulo();
		return articulo;
	}
	
	public Articulo fabricarPolloAsado() {
		Articulo articulo = new Articulo();
		return articulo;
	}
	
	public Articulo fabricarArrozConMenestra() {
		Articulo articulo = new Articulo();
		return articulo;
	}
	
	//Muchos otros metodos parecidos para otros productos
	
}
