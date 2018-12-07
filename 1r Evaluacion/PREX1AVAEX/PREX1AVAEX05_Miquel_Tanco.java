import java.util.Scanner;
public class PREX1AVAEX05_Miquel_Tanco {
	
	private static Scanner sc = new Scanner(System.in);
	//Implementamos StringBuilder,  para concatenar chars
	private static StringBuilder cesar = new StringBuilder();
	
		//Utilizamos la funcion del ejercicio
	
	public static String xifratCesar(String cadenaAXifrar) {
		
		//La variable salto la utilizamos para determinar cuantas letras van a correrse hacia la derecha 
		//Ej: si ponemos 3 --> A=D | si ponemos 4 --> A=E
		
		int salto=3;
	
        //Creamos un bucle que se repita tantas veces como el largo del texto que hemos introducido
        
        for (int i = 0; i < cadenaAXifrar.length(); i++) {
        	
        //Comprobamos si el texto está en minuscula o mayuscula
        	
            if (cadenaAXifrar.charAt(i) >= 'a' && cadenaAXifrar.charAt(i) <= 'z') {
            	
            	//Se comprueba que si la letra+salto será mayor que Z, se desplace 3-26 puestos hacia la
            	//derecha(como 26 es negativo lo hara hacia la izq), sino unicamente se desplazará 3 puestos
            	// 26 corresponde al alfabeto ingles 
            	
            	if ((cadenaAXifrar.charAt(i) + salto) > 'z') {
                    cesar.append((char) (cadenaAXifrar.charAt(i) + salto - 26));
                } else {
                	cesar.append((char) (cadenaAXifrar.charAt(i) + salto));
                }
            } else if (cadenaAXifrar.charAt(i) >= 'A' && cadenaAXifrar.charAt(i) <= 'Z') {
                if ((cadenaAXifrar.charAt(i) + salto) > 'Z') {
                    cesar.append((char) (cadenaAXifrar.charAt(i) + salto - 26));
                } else {
                    cesar.append((char) (cadenaAXifrar.charAt(i) + salto));
                }
            }
        }
        
        //Convertimos los chars a un String
        
        return cesar.toString();
	}
	
	
	public static void main(String[] args) {
		
		//Creamos las variables 
		
		String cadenaAXifrar;
        
        //Insertamos el texto desde teclado
		
            System.out.print("Introduce el texto que quieres cifrar: ");
            cadenaAXifrar = sc.nextLine();
            
        //Mostramos en pantalla el texto cifrado   
            
        System.out.println("El texto cifrado es: " + xifratCesar(cadenaAXifrar));
	}
 }