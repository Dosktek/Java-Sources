public class Iguales {
	public static void main (String[] args) {
		if (sonIguales(args[0], args[1])) {
			System.out.println("Las cadenas de caracteres son iguales");
		} else {
			System.out.println("Las cadenas de caracteres son distintas");
		}
	}
	
	public static boolean sonIguales(String s1, String s2) {
		if (s1.length() == s2.length()) {
			for (int i = 0; i < s1.length(); ++i) {
				if (s1.charAt(i) != s2.charAt(i)) {
					return false;
				}
			}
			return true;
			
		} else {
			return false;
		}
	}
}
