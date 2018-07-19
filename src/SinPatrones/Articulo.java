package SinPatrones;

public class Articulo {

	private String nombre;
	private String descripcion;
	private double precio;
	private String tipo; //Puede ser plato, bebida, botana, combo1, combo2, etc
	
	
	public Articulo() {
		
	}
	
	public Articulo(String nombre, String descripcion, double precio, String tipo) {
		// Recuerde que en composite se debe tener una lista/arreglo de articulos simples
	}
	
	public double getPrecio() {
		return precio;
	}
}
