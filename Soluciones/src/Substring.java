public class Substring {
	public static void main (String[] args) {
		int inicio = Integer.parseInt(args[0]);
		int fin = Integer.parseInt(args[1]);
		
		System.out.println("Substring(" + args[2] + ", " + inicio + ", " + fin + ") = " + getSubstring(args[2], inicio, fin));
	}
	
	public static String getSubstring(String palabra, int inicio, int fin) {
		char[] buffer = new char[fin-inicio];
		
		for (int i = 0; inicio+i < fin; ++i) {
			buffer[i] = palabra.charAt(inicio+i);
		}
		
		return new String(buffer);
	}
}