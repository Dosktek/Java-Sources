public class Reemplazar {

	public static void main(String[] args) {
		char x = args[0].toCharArray()[0];
		char y = args[1].toCharArray()[0];
		String cadena = args[2];
		
		System.out.println("La nueva cadena es " + replace(args[2], x, y));
		System.out.println("La nueva cadena  con metodo replace es  " + cadena.replace(x,y));;
	}	
	
	public static String replace(String s, char x, char y) {
		char[] s2 = new char[s.length()];
				
		for (int i = 0; i < s.length(); ++i) {
			if (s.charAt(i) == x) {
				s2[i] = y;
			} else {
				s2[i] = s.charAt(i);
			}
		}
		
		return new String(s2);
	}
}
