public class Ejercicio5 {
	public static void main (String[] args) {
		double menor = Double.parseDouble(args[0]);
		for(int i = 1; i < args.length; ++i) {
			if(menor >= Double.parseDouble(args[i])) {
				menor = Double.parseDouble(args[i]);
			} 
		}
		
		System.out.println("El numero menor es " + menor);
	}
}