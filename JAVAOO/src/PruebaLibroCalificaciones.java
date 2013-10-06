//import java.util.*;
import javax.swing.JOptionPane;
public class PruebaLibroCalificaciones {

//private static Scanner entrada;

public static void main (String args[]){
	
	//entrada = new Scanner ( System.in);
	String nombreDelCurso = JOptionPane.showInputDialog("Cuál es el Nombre del Curso?");
	String nombreDelInstructor = JOptionPane.showInputDialog("Cuál es el Nombre del Instructor?");
	System.out.println();
	LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones(nombreDelCurso,nombreDelInstructor);
	miLibroCalificaciones.mostrarMensaje();
	miLibroCalificaciones.determinarPromedioClase();
}// fin main
}// fin de la clase PruebaLibroCalificaciones
