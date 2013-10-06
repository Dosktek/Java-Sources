
public class Factura {
private  String IDPIEZA;
private  String DESCRIPCCION;
private  int CANTIDAD;
private  double PRECIO;



public Factura(String IDpieza, String Descripcion, int Cantidad, int precio)
{
	IDPIEZA = IDpieza;
	DESCRIPCCION = Descripcion;
	CANTIDAD = Cantidad;
	PRECIO = precio;
}

public void establecerPieza(String ID)
{
	IDPIEZA = ID;
}	

public void establecerDescripcion(String descripcion)
{
	DESCRIPCCION = descripcion;
}

public void establecerCantidad(int cantidad)
{
	if(cantidad>0){
		CANTIDAD = cantidad;
	}
}
	

public void establecerPrecio(double precio)
{
	if(precio>0){
		PRECIO = precio;
	}
}

public void obtenerPieza()
{
	System.out.printf("ID Pieza :%s\n",IDPIEZA);
}	

public void obtenerDescripcion()
{
	System.out.printf("Descripcion %s: \n",DESCRIPCCION);
}




public void obtenerPrecio()
{
	System.out.printf("Precio del Producto: %f\n",PRECIO);
}


public void obtenerCantidad()
{
	System.out.printf("Cantidad de productos: %d\n",CANTIDAD);
}

public Double obtenerMontoFactura(){
	
	double Total = CANTIDAD * PRECIO;
	return  Total;
}


}
