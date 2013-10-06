public class Ejercicio4 {
	public static void main(String[] args) {
		int numero = Integer.parseInt(args[0]);
		if(numero > 9 && numero < 100) {
			// unidades
			int d1 = numero%10;
			// decenas
			int d2 = numero/10;
			
			if(d1%2 == 0 && d2%2 == 0) {
				System.out.println("El promedio de los digitos del numero es " + (d1+d2)/2);
			} else {
				System.out.println("Algunos de los digitos del numero no son pares");
			}			
		} else {
			System.out.println("El numero ingresado no esta en el rango");
		}
	}
}