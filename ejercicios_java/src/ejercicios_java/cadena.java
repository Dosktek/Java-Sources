package ejercicios_java;

public class cadena {

	public static void main(String[] args) {
		String arreglo[] = args[0].split(";");
		String mayor = "";
		int mayo = 0;
		for (int i = 0;i<arreglo.length;i++){
			if (arreglo[i].length()>mayo){
				mayo = arreglo[i].length();
				mayor = arreglo[i];
		}
	}
		System.out.println("la pal mayor es: "+ mayor);
		System.out.println("el tam es: "+ mayo);
	}

}
