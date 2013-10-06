/**Se desea desarrollar un sistema para una concesionaria de vehículos. 
 * Los vehículos se clasifican en: autos, camionetas y motocicletas. 
 * Todos los vehículos tienen un código, una marca, 
 * tipo (auto, camioneta, etc.), un modelo (ańo), una patente y un kilometraje. 
 * Además, la concesionaria lleva un registro de las ventas realizadas, 
 * cada registro consiste de la siguiente información: monto de la venta, v
 * ehículo vendido (código), apellido, nombre y ci del comprador.**/
public class Vehiculo {
private int CODIGO, ANNIO,KILOMETRAJE;
private String MODELO,TIPO,PATENTE,MARCA;


public Vehiculo(){};
public Vehiculo(int codigo,int annio,int kilometraje, String modelo,String marca, String tipo, String patente){
	this.CODIGO = codigo;
	this.ANNIO = annio;
	this.MARCA = marca;
	this.KILOMETRAJE = kilometraje;
	this.MODELO = modelo;
	this.TIPO = tipo;
	this.PATENTE = patente;
}

public void MostarVehiculo(){
	System.out.println("Vehiculo:"+"\nCodigo : " +this.CODIGO + "\nAño: " + this.ANNIO + "\nKilometraje: "+ this.KILOMETRAJE + "\nModelo: " + this.MODELO + "\nMarca: " + this.MARCA + "\nTipo:" + this.TIPO + "\nPatente:" + this.PATENTE);
}
}

