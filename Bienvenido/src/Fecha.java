/*(La clase Fecha) Cree una clase llamada Fecha, que incluya tres variables de instancia: un mes (tipo i n t), un día
(tipo i n t) y un año (tipo i nt). Su clase debe tener un constructor que inicialice las tres variables de instancia, y debe asumir
que los valores que se proporcionan son correaos. Proporcione un método establecer y un método obtener para cada varia­
ble de instancia. Proporcione un método mos tra rF e ch a , que muestre el mes, día y año, separados por barras diagonales (/).
Escriba una aplicación de prueba llamada PruebaFecha, que demuestre las capacidades de la clase Fecha.
*/
public class Fecha {
private int MES;
private int DIA;
private int ANNIO;




public Fecha(int dia, int mes, int annio)
{
	DIA = dia;
	MES = mes;
	ANNIO = annio;
}

public Fecha(){}

public void establecerDia(int dia){
	if(dia>0 && dia <=31){
		DIA = dia;
	}
	
}

public void establecerMes(int mes){
	if(mes>0 && mes <=12){
		MES = mes;
	}
	
}

public void establecerAnnio(int annio){
	if(annio>2010 && annio <=2020){
		ANNIO = annio;
	}
	
}

public String mostrarFecha(){
	return String.format("%d/%d/%d", DIA,MES,ANNIO);
}

}
