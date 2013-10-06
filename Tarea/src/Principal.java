import javax.swing.JOptionPane;
public class Principal {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		
		
		Persona persona1 = new Persona();
		String nombre = JOptionPane.showInputDialog("ingrese el nombre de la persona");
		String apellido = JOptionPane.showInputDialog("ingrese el apellido de la persona");;
		int telefono = Integer.parseInt(JOptionPane.showInputDialog("ingrese numero de telefono"));
		
		persona1.setApellido(apellido);
		persona1.setNombre(nombre);
		persona1.setTelefono(telefono);
		
		Cuenta cuenta1 = new Cuenta(100,12000,persona1);
		cuenta1.getCuenta();
		
		
		String tipo = JOptionPane.showInputDialog("ingrese el tipo de transacción");
		int monto = Integer.parseInt(JOptionPane.showInputDialog("ingrese el monto de la transacción"));
		cuenta1.Transaccion(monto,tipo);
		
		
		Vehiculo hyundai = new Vehiculo(100,2010,10000,"Elantra","Hyundai","Auto","DFDF12");
		
		Registro_Venta  Venta = new Registro_Venta(persona1,hyundai);
		Venta.mostarVenta();
		
	}

}
