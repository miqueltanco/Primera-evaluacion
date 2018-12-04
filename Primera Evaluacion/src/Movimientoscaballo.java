import java.util.Scanner;

public class Movimientoscaballo {

	public static void main(String[] args) {
	
	Cavall pegaso;
	
	//Instancias
	pegaso = new Cavall();
	//Inicializacion
	Scanner sc = new Scanner(System.in);
	//Variables locales
	int edadtemporal;
	
	//Impresión de un metodo desde clase Padre
	System.out.println("Pegaso: " + pegaso.correr());
	
	//Asignacion de un valor a un atributo padre y uso de un if con ello
	pegaso.setPropietario(false);
	
	if (pegaso.isPropietario() == false) {
		
		System.out.println("El pegaso no tiene dueño");
	}
	
	//Scanner asignando valor a una variable padre, asignar valor a una variable local con valores de padre,e impresion 
	
		System.out.print("Introduce una edad: ");
		pegaso.setEdad(sc.nextInt()); 
		
		edadtemporal = pegaso.getEdad();
		
		System.out.println("La edad del pegaso es: " + pegaso.getEdad());
		System.out.println("La edad del pegaso segun variable local es: " + edadtemporal);
		
	//Objeto nuevo llamado alfonso
						
		Cavall alfonso;
		
		alfonso = new Cavall();
		
	//nombrepropietario es un variable estatica
		
		System.out.println("El propietario de pegaso es: " + pegaso.nombrepropietario);
		System.out.println("El propietario de alfonso es: " + alfonso.nombrepropietario);
		alfonso.setNombrepropietario("Jose");
		System.out.println("El propietario de alfonso ha cambiado a: " + alfonso.nombrepropietario);
		System.out.println("El propietario de pegaso ahora es: " + pegaso.nombrepropietario);
		
	}
}