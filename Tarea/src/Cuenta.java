

public class Cuenta {
	public int NumeroCuenta;
	private int Saldo;
	public Persona Propietario = new Persona();
	
	
	
	public Cuenta(){}
	public Cuenta(int numerocuenta,int saldo, Persona propietario){
		this.NumeroCuenta = numerocuenta;
		setSaldo(saldo);
		this.Propietario = propietario;
	}
	
	
	public void  setSaldo(int saldo){
		if(saldo>0){
			this.Saldo = saldo;
		}
	}
		
	public void Transaccion(int cantidad, String tipoTransaccion){
	if(tipoTransaccion.equalsIgnoreCase("retiro")){
		this.Saldo = this.Saldo - cantidad;
		System.out.print("Ingresetipo Transaccion : retiro, Nuevo Saldo:"+this.Saldo);
	}else if (tipoTransaccion.equalsIgnoreCase("deposito")){
		this.Saldo = this.Saldo + cantidad;
		System.out.print("tipo Transaccion : deposito, Nuevo Saldo:"+this.Saldo);
	}else{System.out.print("Ingrese tipoTransaccion Valida");
		
	}
	}
	public void getCuenta(){
		System.out.println("\nNumero de Cuenta: " + this.NumeroCuenta +"\nPropietario: " +  "\nDatos Personales: ");
		this.Propietario.mostrarPersona();
	}
}
