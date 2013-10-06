/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;


public class Soldado extends Terran implements IGritable {
    
    private int nivelDisparo;
    
   public Soldado(int energia,int x, int y, int nivel,int niveldisparo){
       super(energia,x,y,nivel);
       this.nivelDisparo = niveldisparo;
   }
   public Soldado(){}
   
   public void disparar(Soldado target){
       target.recibeAtaque(this.getNivelAtaque() + this.nivelDisparo);
       System.out.print(target.getEstado());
   }

    @Override
    public void gritar() {
        System.out.print("ARGGGGGGGGGG!!!!!");
    }

    @Override
    public void callar() {
        System.out.print("=X");
    }
}
