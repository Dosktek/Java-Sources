// programa que suma tres elementos
import java.util.Scanner;
public class Suma {
	
	private static Scanner entrada;
	
	public static void main ( String args[] ) 
	{
		 entrada = new Scanner ( System.in );
		
		int numero1, // 1er elemento de tipo entero
		numero2, // 2do elemento de tipo entero
		numero3, // 3ro elemento de tipo entero
		suma; // suma de todos los elementos
		
		System.out.print("Ingrese primer elemento a sumar:");
		numero1 = entrada.nextInt();
		System.out.print("Ingrese segundo elemento a sumar:");
		numero2 = entrada.nextInt();
		System.out.print("Ingrese tercer elemento a sumar:");
		numero3 = entrada.nextInt();
		
		suma = numero1 + numero2 + numero3;
		
		System.out.printf("La suma es: %s\n",suma);
	}

}
