public class OrdeAlfa {
	
	public static void main(String[] args) {
		System.out.println("El orden es:");
		int relacion = args[0].compareToIgnoreCase(args[1]);
		
		if (relacion > 0) {
			System.out.println("1. " + args[1]);
			System.out.println("2. " + args[0]);
		} else if (relacion < 0) {
			System.out.println("1. " + args[0]);
			System.out.println("2. " + args[1]);
		} else {
			System.out.println("Las cadenas son alfabeticamente iguales");
		}
	}
}
