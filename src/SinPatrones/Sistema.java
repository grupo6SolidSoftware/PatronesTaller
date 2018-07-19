package SinPatrones;

import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {
//		El mismo sistema se lo va vender a 2 locales de comida.
		Scanner scanner = new Scanner(System.in);
		
		String menu = "  *** Sistema para preparar comida automáticamente ***\n"
				+ "1. Esquina de Ales\n"
				+ "2. Pollos Gus\n"
				+ "3. Salir del sistema\n"
				+ "Seleccione una opción:";
		System.out.println(menu);
		String opcion = scanner.nextLine();
		while (! opcion.equals("3")){
			if (opcion.equals("1")){
				System.out.println("Bienvenido a la Esquina de Ales");
//				Preparar un Arroz con menestra y pollo
			}else if(opcion.equals("2")){
				System.out.println("Bienvenido a Pollos Gus");
//				Preparar un Arroz con menestra y pollo
			}else{
				System.out.println("Opción incorrecta");
			}
			System.out.println(menu);
			opcion = scanner.nextLine();
			
		}
		System.out.println("Se cerró el programa");
	}
	
}
