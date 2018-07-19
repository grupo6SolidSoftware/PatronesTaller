package ConPatrones;

import ConPatrones.factory.AbstractFatory;
import ConPatrones.factory.EsquinaDeAles;
import ConPatrones.factory.PollosGus;
import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {
//		El mismo sistema se lo va vender a 2 locales de comida.
        Scanner scanner = new Scanner(System.in);
        AbstractFatory gus = new PollosGus();
        AbstractFatory ales = new EsquinaDeAles();
        String menu = "  *** Sistema para preparar comida automaticamente ***\n"
                + "1. Esquina de Ales\n"
                + "2. Pollos Gus\n"
                + "3. Salir del sistema\n"
                + "Seleccione una opcion:";
        System.out.println(menu);
        String opcion = scanner.nextLine();
        while (!opcion.equals("3")) {
            if (opcion.equals("1")) {
                System.out.println("Bienvenido a la Esquina de Ales");
//				Preparar un Arroz con menestra y pollo
                System.out.println(ales.fabricarArrozConMenestraYPollo());
            } else if (opcion.equals("2")) {
                System.out.println("Bienvenido a Pollos Gus");
//				Preparar un Arroz con menestra y pollo
                System.out.println(gus.fabricarArrozConMenestraYPollo());
            } else {
                System.out.println("Opcion incorrecta");
            }
            System.out.println(menu);
            opcion = scanner.nextLine();

        }
        System.out.println("Se cerro el programa");
    }

}
