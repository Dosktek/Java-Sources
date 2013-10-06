
public class TransformaNombres {
	
	public static void main(String[] args) {
		if (args.length > 0 && args.length%2 == 0) {
			System.out.println(Transformar(args));
		} else {
			System.out.println("! Cantidad  de argumentos insuficientes");
		}
	}
	
	//public static StringBuffer Transformar(String[] cadena) {
	public static String Transformar(String[] cadena) {
		String transformadas = "";
		//StringBuffer transformadas = new StringBuffer(cadena.length);
		int i = 0;
		
		for (; i < cadena.length-2; ++i) {
			transformadas += cadena[i+1] + ", ";
			//transformadas.append(cadena[i+1] + ", ");
			
			char[] inicial = new char[1];
			inicial[0] = cadena[i++].charAt(0);
			
			transformadas += new String(inicial) + "\n";
			//transformadas.append(new String(inicial) + "\n");
		}
		
		transformadas += cadena[i+1] + ", ";
		//transformadas.append(cadena[i+1] + ", ");
		
		char[] inicial = new char[1];
		inicial[0] = cadena[i++].charAt(0);
		
		transformadas += new String(inicial);
		//transformadas.append(inicial);
		
		return transformadas;
	}	
}
