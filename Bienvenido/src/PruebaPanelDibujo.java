import javax.swing.JFrame;

public class PruebaPanelDibujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PanelDibujo panel1 = new PanelDibujo();
		
		//crea un marco
		JFrame aplicacion = new JFrame();
		
		//establece le marco para salir de la aplicacion
		
		aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		aplicacion.add(panel1);
		aplicacion.setSize(250,250);
		aplicacion.setVisible(true);
	}

}
