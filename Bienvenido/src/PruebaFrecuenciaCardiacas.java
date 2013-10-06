import javax.swing.JOptionPane;


public class PruebaFrecuenciaCardiacas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int  dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Dia de Nacimiento"));
		int  mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Mes Nacimiento"));
		int  annio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Año Nacimiento"));
		double  altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Altura"));
		double  peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Peso"));
		
		String nombre = JOptionPane.showInputDialog("Ingrese Nombre");
		String apellido = JOptionPane.showInputDialog("Ingrese Apellido");
		
		
		
		FrecuenciasCardiacas Frec_1 = new FrecuenciasCardiacas(nombre,apellido,dia,mes,annio,peso,altura);
		
		String mensaje = String.format("Nombre Completo: %s %s",Frec_1.obtenerNombre(),Frec_1.obtenerApellido());
		JOptionPane.showMessageDialog(null, mensaje);
		
		String mensaje2 = String.format("Edad: %d",Frec_1.mostrarEdad());
		JOptionPane.showMessageDialog(null, mensaje2);
		
		String mensaje3 = String.format("Rango Maximo: %d",Frec_1.mostrarFrecuencia());
		JOptionPane.showMessageDialog(null, mensaje3);
		
		String mensaje4 = String.format("Rango de Frecuencias  %s",Frec_1.mostrarRango());
		JOptionPane.showMessageDialog(null, mensaje4);
		
		String mensaje5 = String.format("%s",Frec_1.tablaBMI());
		JOptionPane.showMessageDialog(null, mensaje5);
		
		String mensaje6 = String.format("Tu BMI: %s",Frec_1.mostrarBMI());
		JOptionPane.showMessageDialog(null, mensaje6);
		
		
		
	}

}
