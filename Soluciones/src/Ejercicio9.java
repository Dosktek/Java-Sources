public class Ejercicio9 {
	public static void main (String[] args) {
		String palabra = args[0];
		int vocales = 0;
		int consonantes = 0;
		
		for(int i = 0; i < palabra.length(); ++i) {
			char c = palabra.charAt(i);
			
			switch (c) {
			    case 'a':
			    case 'A':
			    case 'e':
			    case 'E':
			    case 'i':
			    case 'I':
			    case 'o':
			    case 'O':
			    case 'u':
			    case 'U':
			    	vocales++;
			    	break;
			    
			    default:
			    	consonantes++;
			    	break;
			}
		}
		
		System.out.println("Vocales: " + vocales);
		System.out.println("Consonantes: " + consonantes);
	}
}