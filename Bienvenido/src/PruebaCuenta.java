import javax.swing.JOptionPane;
public class PruebaCuenta {

	public static void main (String args[])
	{
		Cuenta cuenta1 = new Cuenta(260);
		Cuenta cuenta2 = new Cuenta(-25);
		
		
		
		System.out.printf("Saldo de cuenta 1 : $%.2f\n",cuenta1.obtenerSaldo());
		
		System.out.printf("Saldo de cuenta 2 : $%.2f\n",cuenta2.obtenerSaldo());
		;
		
		double monto = Float.parseFloat(JOptionPane.showInputDialog("ingrese el monto a abonar para la cuenta 1"));
		double monto2 = Float.parseFloat(JOptionPane.showInputDialog("ingrese el monto a abonar para la cuenta 2"));
		
		
		
		cuenta1.abonar(monto);
		cuenta2.abonar(monto2);
		
		String mensaje = String.format("Saldo Cuenta 1: %s",cuenta1.obtenerSaldo());
		JOptionPane.showMessageDialog(null, mensaje);
		
		String mensaje2 = String.format("Saldo Cuenta 2: %s",cuenta2.obtenerSaldo());
		JOptionPane.showMessageDialog(null, mensaje2);
		
		double retiro = Float.parseFloat(JOptionPane.showInputDialog("ingrese el monto a retirar para la cuenta 1"));
		
		cuenta1.retirarMoney(retiro);

	}
}
