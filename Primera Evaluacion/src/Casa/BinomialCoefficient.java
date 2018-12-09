package Casa;
import java.util.Scanner;

public class BinomialCoefficient {
   public static long factorial(int n) {
      if(n <= 1) {
         return 1;
      }
      return n * factorial(n - 1);
   }
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);  
      System.out.print("Enter n value: ");
      
      int n = sc.nextInt();
      System.out.print("Enter r value: ");
      
      int k = sc.nextInt();
      long resultado = factorial(n)/(factorial(k)*factorial(n-k));
      System.out.println("c("+n+", "+k+"): "+ resultado);
   }
}