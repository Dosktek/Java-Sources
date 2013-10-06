import javax.swing.JOptionPane;


public class PruebaFactura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factura factura_1 = new Factura ("1A10", "Nexus 10", 23, 229000);
		String nombre = JOptionPane.showInputDialog("Cuál es el Nombre del Producto?");
		String ID = JOptionPane.showInputDialog("Cuál es el ID del Producto?");
		int  cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cuál es la cantidad del Producto?"));
		double  precio = Double.parseDouble(JOptionPane.showInputDialog("Cuál es el precio del Producto?"));
		
		factura_1.establecerCantidad(cantidad);
		factura_1.establecerPrecio(precio);
		factura_1.establecerDescripcion(nombre);
		factura_1.establecerPieza(ID);
		
		factura_1.obtenerCantidad();
		factura_1.obtenerPrecio();
		factura_1.obtenerDescripcion();
		factura_1.obtenerPieza();
		String mensaje = String.format("Total Factura: %f",factura_1.obtenerMontoFactura());
		JOptionPane.showMessageDialog(null, mensaje);
	}

}
