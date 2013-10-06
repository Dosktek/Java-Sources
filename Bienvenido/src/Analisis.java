
public class Analisis {

	private static java.util.Scanner leer;

	public static void main(String[] args) {
		leer = new java.util.Scanner(System.in);
		int aprobados = 0 ;
		int reprobados = 0;
		int contadorEstudiantes = 1;
		int resultado;
		
		
		while(contadorEstudiantes<=10){
			System.out.println("Ingrese Resultado");
			resultado = leer.nextInt();
			contadorEstudiantes++;	
			if(resultado == 1){
				aprobados++;
			}else if (resultado == 2)
				reprobados++;
			
			
	}
		System.out.printf("Hay %d Aprobados y %d Reprobados\n",aprobados,reprobados);
		if(aprobados>=8)
			System.out.println("Hay Bono!!!!");
		

}
}
