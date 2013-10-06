
public class DepositoEstructurado extends  Deposito{
private double capitalVariable;
private double tipoInteresesVariable;


public void getCapitalVariable()
{
	System.out.println(this.capitalVariable);
}

public void getTipoInteresesVariable()
{
	System.out.println(this.tipoInteresesVariable);
}

public void setTipoInteresesVariable(double tipoInteresesVariable)
{
	this.tipoInteresesVariable = tipoInteresesVariable;
}
}
