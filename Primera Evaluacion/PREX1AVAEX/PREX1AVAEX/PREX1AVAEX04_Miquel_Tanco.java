package PREX1AVAEX;

import java.util.Scanner;
public class PREX1AVAEX04_Miquel_Tanco {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]) {
		
		//Creamos las variables 
		//**EL NUMERO DE INTERACIONES ES UN EXTRA QUE HE AÑADIDO YO, MAS ABAJO LO EXPLICO**
		
		int numero;
		int numerointeraciones=0;
		
		//Insertamos valores desde teclado
	
		System.out.print("Inserta un número: ");
		numero = sc.nextInt();

		//Comprobamos que el valor es mayor que 0, si no lo es, se pide que introduzca otro
		
		while (numero <=0) {
			System.out.print("El número que has introducido es menor que 0, inserta otro número: ");
			numero = sc.nextInt();
		}
		
		//Usamos el algoritmo de Collatz, y mostramos en pantalla todos los numeros, incluido el inicial
		
		if (numero >= 1) {
			System.out.print(numero + " ");
			while (numero != 1 ) {
				if (numero%2==0) {
					numero = numero/2;
				}
				else {
					numero = (numero*3)+1;
				}
				
				System.out.print(numero + " ");
				numerointeraciones++;
			}
			System.out.println(" ");
		//**EL NUMERO DE INTERACIONES EQUIVALE A LAS VECES QUE SE HA TENIDO QUE HACER EL ALGORITMO PARA LLEGAR A 1**
		//**EJEMPLO EL NUMERO 27 TIENE 111, ES UN NUMERO MUY CURIOSO
		//**EN WIKIPEDIA LO MENCIONAN ---> https://es.wikipedia.org/wiki/Conjetura_de_Collatz **
			System.out.print("El numero de interaciones han sido: " + numerointeraciones);
		}
	}
}