/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Alumnos
 */
public class Terran {
    private int Energia;
    private int Posicionx;
    private int Posiciony;
    private int nivelAtaque;
    private String Estado;
    
    public Terran(){}
    public Terran(int energia,int x, int y, int nivel){
        this.Energia = energia;
        this.Posicionx = x;
        this.Posiciony = y;
        this.nivelAtaque = nivel;
        this.Estado = "Vivo";
    }
    
    public void ganaEnergia (int Valor){
        if(Valor<=10){
            this.Energia = Valor;
        }
    }
    
    public void recibeAtaque(int Valor){
        this.Energia = this.Energia - Valor;
        if(this.Energia<= 0){
            this.Estado = "Muerto";
        }
    }
    
    public void movrePosicion( int x, int y){
        if(this.Estado.compareTo("Vivo")==0){
            this.Posicionx = x;
            this.Posiciony = y;
        }
    }
    
    public String getEstado(){
        return this.Estado;
    }
    
    public int getNivelAtaque(){
        return nivelAtaque;
    }
    public void setNivelEnergia(int nivel){
        this.ganaEnergia(nivel);
    }
}
