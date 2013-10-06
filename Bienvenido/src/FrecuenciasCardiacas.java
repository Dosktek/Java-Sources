
public class FrecuenciasCardiacas {
private String NOMBRE;
private String APELLIDO;
private int DIA;
private int MES;
private int ANNIO;
private int EDAD;
private int FRECUENCIA;
private double PESO;
private double ALTURA;
private double BMI;
private double RANGOMIN;
private double RANGOMAX;

public FrecuenciasCardiacas (String nombre, String apellido,int dia, int mes ,int annio,double peso,double altura){
	NOMBRE = nombre;
	APELLIDO = apellido;
	DIA = dia;
	MES = mes;
	ANNIO = annio;
	PESO = peso;
	ALTURA = altura;
}


public FrecuenciasCardiacas(){};
public void establecerNombre(String Nombre){
	NOMBRE = Nombre;
}

public String obtenerNombre(){
	return(NOMBRE);
}

public void establecerApellido(String Apellido){
	APELLIDO = Apellido;
}

public String obtenerApellido(){
	return(APELLIDO);
}

public void establecerDia(int dia){
	if(dia>0 && dia <=31){
		DIA = dia;
	}
	
}

public String mostrarFecha(){
	return String.format("%d/%d/%d", DIA,MES,ANNIO);
}


private  void calcularEdad(){
	EDAD = 2013 - ANNIO;
}

public int  mostrarEdad(){
	calcularEdad();
	return EDAD;
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
private void calcularFrecuencia(){
	FRECUENCIA = 220 - EDAD;
}

public int mostrarFrecuencia(){
	calcularFrecuencia();
	return(FRECUENCIA);
}

private void calculaRango(){
	RANGOMIN = (double)FRECUENCIA * 0.5;
	RANGOMAX = (double)FRECUENCIA * 0.85;
}

public String mostrarRango(){
	calculaRango();
	System.out.println(RANGOMIN);
	System.out.println(RANGOMAX);
	return String.format("[%f, %f]",RANGOMIN,RANGOMAX);
}

private void calcularBMI(){
	BMI = PESO / (ALTURA * ALTURA);
}

public String  mostrarBMI(){
	calcularBMI();
	String estado = "null";
	if(BMI<18.5){
		estado = "Bajo Peso";
	}else if(BMI>18.5 && BMI<=24.9){
		estado = "Normal";
	}else if(BMI>24.9 && BMI<=29.9){
		estado = "Sobrepeso";
	}else if(BMI>29.9){
		estado = "Obeso";
	}
	return String.format("%f y su estado es : %s ",BMI,estado);
}

public String tablaBMI(){
	return String.format("VALORES DE BMI\nBajo peso : menos de 18.5\nNormal: entre 18.5 y 24.9\nSobrepeso: entre 25 y 29.9\nObeso: 30 o mas");
}
}
