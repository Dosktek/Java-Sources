
public class Persona {
	public String Apellido;
	public String Nombre;
	private int Telefono;

public Persona(){}

public void mostrarPersona(){
	System.out.println("Apellido : "+this.Apellido + "\nNombre: "+ this.Nombre + "\nTelefono: " + this.Telefono);
}
public void setTelefono(int numerotel){
	String x = Integer.toString(numerotel);
	if (x.length()==9){
		this.Telefono = numerotel;
	}
}
	
	public void setApellido(String apellido)
	{
		this.Apellido = apellido;
	}
	
	public void setNombre(String nombre){
		this.Nombre = nombre;
		
	}
}
