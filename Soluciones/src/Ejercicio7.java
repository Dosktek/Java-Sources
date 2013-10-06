public class Ejercicio7 {
	public static void main (String[] args) {
		double[] v = new double[args.length];
		double promedio = 0.0;
		
		for (int i = 0; i < args.length; i++) {
			v[i] = Double.parseDouble(args[i]);
		}
		
		double piv = 0.0;
		for (int i = 0; i < args.length/2; i++) {
			piv = v[i];
			v[i] = v[args.length-i-1];
			v[args.length-i-1] = piv;
		}
		
		for (double x : v) {
			System.out.print(x + " ");
			promedio += x/v.length;
		}
		System.out.println("\nEl promedio es " + promedio);
	}
}