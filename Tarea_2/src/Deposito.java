
public class Deposito {
	
	private double capital;
	private int plazoDias;
	private double tipoIntereses;
	Persona Titular = new Persona();

	
	public double liquidar()
	{
		return 0;
	}
	
	public void getIntereses()
	{
		System.out.println(this.tipoIntereses);
	}
	
	public void getCapital()
	{
		System.out.println(this.capital);
	}
	
	public void getTitular()
	{
		this.Titular.getNombre();
	}
	
	public void getPlazoDias()
	{
		System.out.println(this.plazoDias);
	}
}
