import java.util.Scanner;
public class PREX1AVAEX03_Miquel_Tanco{
	
	private static Scanner sc = new Scanner(System.in);
	
	//Creamos las variables
	
	static int k;
	static int n;
		
	//En este método factorizamos n y lo devolvemos calculado para asi poder utilizarlo en el siguiente metodo
	
	public static int factorial (int n) {
		
		int factorial = n;
		
	    for (int i = 1; i < n; i++) {
	        factorial = factorial * i;
	    }
	    n = factorial;
		
		return n;
	}
	
	//Calculamos utilizando la formula de coeficiente binomial invocando varias veces el metodo factorial
	
	public static int binomialCoefficient(int n, int k) {	
		
		int resultado = factorial(n)/(factorial(k)*factorial(n-k));
		
		n = resultado;
		
		return n;
		}
		
	public static void main(String[] args) {
						
		//Insertamos valores desde teclado
		
				System.out.print("Inserta un n: ");
				n = sc.nextInt();
				System.out.print("Inserta un k: ");
				k = sc.nextInt();

		//Comprobamos que el valor introducido es mayor que 0
				
				while (k <=0) {
					System.out.print("k que has introducido es menor que 0, inserta otra k: ");
					k = sc.nextInt();
				}
				while (n <=0) {
					System.out.print("n que has introducido es menor que 0, inserta otro n: ");
					n = sc.nextInt();
				}
				
		//Invocamos el método binomial para imprimir en pantalla
				
				System.out.println("c("+n+", "+k+"): "+ binomialCoefficient(n, k));
	}
}