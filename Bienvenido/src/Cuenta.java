
public class Cuenta {
private double saldo;


public Cuenta( double Saldo_inicial)
{
	if(Saldo_inicial>0.0){
		saldo = Saldo_inicial;
	}
}

public void abonar (double monto)
{
/* valida si el saldo es superio a 0.0; si no lo es, 
  el saldo se inicializa en 0.0
 */
	saldo = saldo + monto;
}

public void retirarMoney(double monto)
{
	if(monto<=saldo){
		saldo = saldo - monto;
	}else 
		System.out.println("el monsto excede al saldo");
		
}

public double obtenerSaldo()
{
	return saldo;
}
}
