import javax.swing.JOptionPane;


public class PruebaFecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Dia"));
		int  mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Mes"));
		int  annio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Año"));
		
		Fecha Fecha_1 = new Fecha (dia,mes,annio);
		
		Fecha_1.mostrarFecha();
		
		String mensaje = String.format("Fecha: %s",Fecha_1.mostrarFecha());
		JOptionPane.showMessageDialog(null, mensaje);
	}

}
