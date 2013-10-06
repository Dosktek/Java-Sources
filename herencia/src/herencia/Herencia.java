/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;


public class Herencia {
	
	public static void main(String args[]){
		Soldado a = new Soldado(30,5,5,10,6);
		Soldado b = new Soldado(30,5,5,10,6);
		gato g = new gato();
		hasGritar(a);
		hasGritar(b);
		hasGritar(g);
		a.disparar(b);
		a.disparar(b);
		b.disparar(a);
		
	}
	
	public static void hasGritar(IGritable griton){
		griton.gritar();
	}
	//utilizan la mismaa interfaz origen
	
	
}
