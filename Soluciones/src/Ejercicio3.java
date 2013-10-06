public class Ejercicio3 {
	public static void main(String[] args) {
		double suma = 0.0;
		for(String numero : args) {
			suma += Double.parseDouble(numero);
		}
		
		System.out.println("La suma es " + suma);
	}
}