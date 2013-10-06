
public class Registro_Venta {
private Persona COMPRADOR = new Persona();
private Vehiculo VH_VENDIDO  = new Vehiculo();

public Registro_Venta(){};
public Registro_Venta(Persona comprador, Vehiculo vh){
	this.COMPRADOR = comprador;
	this.VH_VENDIDO = vh;
}
public void mostarVenta(){
	System.out.println("\nComprador: ");
	this.COMPRADOR.mostrarPersona();
	this.VH_VENDIDO.MostarVehiculo();
}

}
