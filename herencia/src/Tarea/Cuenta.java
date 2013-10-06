package Tarea;

public class Cuenta {
	private int NumeroCuenta;
	private int Saldo;
	Persona Propietario = new Persona();
	
	
	
	public Cuenta(){}
	public Cuenta(int numerocuenta,int saldo, Persona propietario){
		this.NumeroCuenta = numerocuenta;
		this.Saldo = saldo;
		this.Propietario = propietario;
	}
	public void setSaldo(int saldo){
		if(saldo>0){
			this.Saldo = saldo;
		}
	}
		
	public void Transaccion(int cantidad, String tipoTransaccion){
	if(tipoTransaccion.equalsIgnoreCase("retiro")){
		this.Saldo = this.Saldo - cantidad;
		System.out.print("Ingresetipo Transaccion : retiro, Nuevo Saldo:"+this.Saldo);
	}else if (tipoTransaccion.equalsIgnoreCase("deposito")){
		this.Saldo = this.Saldo + cantidad;
		System.out.print("tipo Transaccion : deposito, Nuevo Saldo:"+this.Saldo);
	}else{System.out.print("Ingrese tipoTransaccion Valida");
		
	}
	}
}
