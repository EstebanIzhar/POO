
package models;

public class Borde {
    private int ancho;
    private int color;
    
    public Borde(int ancho, int color){
        this.ancho = ancho;
        this.ancho = color;
        
    }
    
    public Borde(){
        this.ancho = 5;
        this.color = 0;
    }
    
    public void setAncho(int ancho){
        if (ancho<10){
            this.ancho = ancho;
        }
        else{
            this.ancho = 5;
            System.err.println("El ancho no debe sobrepasar a 10");
        }
        
        
    }
    
    public void setColor(int color){
        this.color = color;
        
    }
    
    
    public int getAncho(){
        return this.ancho;
    }
    
    
    public int getColor(){
        return this.color;
    }
    
}
