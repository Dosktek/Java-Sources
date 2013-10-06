import java.awt.Graphics;
import javax.swing.JPanel;


public class PanelDibujo  extends JPanel{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void  paintComponent(Graphics g){
			
		super.paintComponent( g );
		
		int anchura = getWidth();
		int altura = getHeight();
		int anch  = anchura /15;
		int altu  = altura /15;
		int base =0;
		int base2 = 0;
		g.drawLine(0,0,0,altura);
		g.drawLine(0,altura,0,0);
		g.drawLine(anchura,0,0,0);
		g.drawLine(anchura,altura,0,altura);
		
		//g.drawLine(0,0,0,altura);
		while(base<altura){
			g.drawLine(0,0,base2,altura-base);
			g.drawLine(0,altura,base2,base);
			g.drawLine(anchura,0,base2,base);
			g.drawLine(anchura,altura,base2,altura-base);
			base = base + altu;
			base2 = base2 + anch;
			
			
		}
	}
}
