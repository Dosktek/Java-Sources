import javax.swing.JOptionPane;


// declarion de clases en jav


public class LibroCalificaciones {
	
	java.util.Scanner entrada = new java.util.Scanner(System.in);
	private String nombreDelCurso;
	private String nombreDelInstructor;
	
	
	public LibroCalificaciones(String nombre, String instructor){
		nombreDelCurso = nombre;
		nombreDelInstructor = instructor;
	};
	public void establecerNobreDelCurso(String nombre){
	
	//java.util.Scanner entrada = new java.util.Scanner(System.in);
	nombreDelCurso = nombre;
	}// fin del metodo establecerNobreDelCurso

	
	public String obtenerNombreDelCurso()
	{
		
		return "Bienvenido al Curso:\"" + nombreDelCurso + "\"" +  ", instructor:" + nombreDelInstructor;
	}//fin del metodo obtenerNombreDelCurso
	
	public void mostrarMensaje()
	{
		
		String mensaje = String.format("%s",obtenerNombreDelCurso());
		JOptionPane.showMessageDialog(null, mensaje);
	} //fin del metodo mostrarMensaje
	
	public void determinarPromedioClase()
	{
		int total;
		int contadorCalif;
		int calificacion;
		double promedio;
		
		total = 0;
		contadorCalif = 0;
		
		System.out.println("Ingrese calificacion (-1 para terminar)");
		calificacion = entrada.nextInt();
		while(calificacion!=-1)
		{
			total = total + calificacion;
			contadorCalif = contadorCalif +1;
			System.out.println("Ingrese calificacion (-1 para terminar)");
			calificacion = entrada.nextInt();
		}
		if(contadorCalif!=0){
			promedio = (double) total/10;
			System.out.println("Total de las calificaciones: " + total);
			System.out.println("promedio de la Clase: " + promedio);
			System.out.println("numero de calificiones ingresadase: " + contadorCalif);
		}else
			System.out.println("no se introdujieron calificaciones");
		
	}
}
