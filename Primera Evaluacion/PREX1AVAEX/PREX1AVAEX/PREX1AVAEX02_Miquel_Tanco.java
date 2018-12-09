package PREX1AVAEX;

import java.util.Scanner;
public class PREX1AVAEX02_Miquel_Tanco {
	
	private static Scanner sc = new Scanner(System.in);
	
	private static StringBuilder ParteEntera = new StringBuilder();
	private static StringBuilder ParteDecimal = new StringBuilder();
	
	//Creamos las variables
	
	static String entero;
	static char punto = '.';
	static double numero;
	static int posicionpunto=9999;
	
	//Creamos un metodo que nos devuelve unicamente la parte entera del numero introducido
	
	static int getPartSencera (double number) {
		entero = (String.valueOf(number));	
		for (int i = 0; i < entero.length(); i++) {
			if (entero.charAt(i) == punto) {
				posicionpunto = i;
			break;
			}
			ParteEntera.append((char) (entero.charAt(i)));
			}
		
		String prueba = String.valueOf(ParteEntera);
		ParteEntera.setLength(0);
		return Integer.valueOf(prueba);
		
	}
	
	//Creamos un metodo que nos devuelve unicamente la parte decimal del numero introducido
	
	static int getPartDecimal (double number) {
		entero = (String.valueOf(number));	
		for (int i = 0; i < entero.length(); i++) {
			
			if (entero.charAt(i) == punto) {
				posicionpunto = i;
			}
			
			if (i > posicionpunto) {
			ParteDecimal.append((char) (entero.charAt(i)));
		}
	}
		String prueba = String.valueOf(ParteDecimal);
		ParteDecimal.setLength(0);
		return Integer.valueOf(prueba);
}
	
public static void main(String[] args) {
				
		//Insertamos valores desde teclado
		
			System.out.print("Inserta un número: ");
			numero = sc.nextDouble();

			//Comprobamos que el valor es mayor que 0, si no lo es, se pide que introduzca otro
			
			while (numero <=0) {
				System.out.print("El número que has introducido es menor que 0, inserta otro número: ");
				numero = sc.nextDouble();
			}	
			
			//Decision es la opcion a elegir por el usuario en el menu
			int decision=0;
			
			//Menu en el cual el usuario selecciona lo que quiere hacer
			
			while (!(decision == 4)) {
				System.out.print("MENU = 1 PARA VER LA PARTE ENTERA, 2 PARA VER LA PARTE DECIMAL, 3 PARA INGRESAR UN NUMERO NUEVO, 4 PARA SALIR: ");
				decision = sc.nextInt();
				
				switch (decision) {
					case 1:
						System.out.println("Tu parte entera es: " + getPartSencera(numero));
						break;
					case 2:
						System.out.println("Tu parte entera es: " + getPartDecimal(numero));
						break;
					case 3:
						System.out.print("Inserta otro un número: ");
						numero = sc.nextDouble();
						break;
					case 4:
						System.out.println("Hasta lueguito");
						break;
					default:
						System.out.println("Por favor introduce un numero correcto");
				}
			}		
		}
}