public class Ejercicio1 {
	public static void main(String[] args) {
		int a, b, producto;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		producto = (a + b)*(a - b);
		System.out.println ("El producto de (" + a + " + " + b + ")(" + a + " - " + b + ") es " + producto);
    }
}
