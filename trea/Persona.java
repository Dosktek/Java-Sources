package Tarea;

public class Persona {
	private String Apellido;
	private String Nombre;
	private int [] Telefono;

public Persona(){}

public void setTelefono(int [] numerotel){
	if (numerotel.length==8){
		this.Telefono = numerotel;
	}
}
}