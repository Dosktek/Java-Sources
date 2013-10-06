public class Ejercicio2 {
    public static void main(String[] args) {
		if(args.length == 3) {
			double x, y, z;	
			x = Double.parseDouble(args[0]);
			y = Double.parseDouble(args[1]);
			z = Double.parseDouble(args[2]);
			
			System.out.println("La suma de " + x + ", " + y + " y " + z + " es " + (x + y + z));
		} else {
			System.out.println("! Cantidad de argumento insuficiente");
		}		
    }
}
