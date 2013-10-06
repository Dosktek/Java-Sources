// compara enteros utilizando if, opereaciones relacionales y de igualdad
import java.util.Scanner;
public class Comparacion {
private static Scanner entrada;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		entrada = new Scanner ( System.in);
		
		int numero1,
			numero2,
			numero3;
		
		System.out.print("Ingresa el primer elemento:");
		numero1 = entrada.nextInt();
		
		System.out.print("Ingresa el segundo elemento:");
		numero2 = entrada.nextInt();
		
		System.out.print("Ingresa el tercer elemento:");
		numero3 = entrada.nextInt();
		
		
		if(numero1==numero2)
		System.out.printf("%d == %d\n",numero1,numero2);
		
		if(numero1==numero3)
		System.out.printf("%d == %d\n",numero1,numero3);
		
		if(numero2==numero3)
		System.out.printf("%d == %d\n",numero2,numero3);
		
		
		if(numero1!=numero2)
		System.out.printf("%d != %d\n",numero1,numero2);
			
		if(numero1!=numero3)
		System.out.printf("%d != %d\n",numero1,numero3);
			
		if(numero2!=numero3)
		System.out.printf("%d != %d\n",numero2,numero3);
		
		
		if(numero1<numero2)
		System.out.printf("%d < %d\n",numero1,numero2);
			
		if(numero1<numero3)
		System.out.printf("%d < %d\n",numero1,numero3);
			
		if(numero2<numero3)
		System.out.printf("%d < %d\n",numero2,numero3);
		
		

		if(numero1>numero2)
		System.out.printf("%d > %d\n",numero1,numero2);
			
		if(numero1>numero3)
		System.out.printf("%d > %d\n",numero1,numero3);
			
		if(numero2>numero3)
		System.out.printf("%d > %d\n",numero2,numero3);
		
		
		if(numero1>=numero2)
		System.out.printf("%d >= %d\n",numero1,numero2);
			
		if(numero1>=numero3)
		System.out.printf("%d >= %d\n",numero1,numero3);
			
		if(numero2>=numero3)
		System.out.printf("%d >= %d\n",numero2,numero3);
		
		
		
		if(numero1<=numero2)
		System.out.printf("%d <= %d\n",numero1,numero2);
				
		if(numero1<=numero3)
		System.out.printf("%d <= %d\n",numero1,numero3);
				
		if(numero2<=numero3)
		System.out.printf("%d <= %d\n",numero2,numero3);
		
	}

}
