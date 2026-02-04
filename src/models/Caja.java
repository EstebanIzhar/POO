
package models;

import processing.core.PApplet;

public class Caja {
   
    private Posicion posicion;
    private Diemension dimension;
    private int color;
    private Borde borde;
    
    
    public Caja(){
        this(new Posicion(), new Diemension(100, 100), new Borde(), 255);
    }
    
    public Caja(Posicion posicion, Diemension dimension, Borde borde, int color){
        this.posicion = posicion;
        this.dimension = dimension;
        this.borde = borde;
        this.color = color;
    }
    
    public Posicion getPosicion(){
        return this.posicion;
    }
    
    public Diemension getDimension(){
        return this.dimension;
    }
    
    public Borde getBorde(){
        return this.borde;
    }
  
    
    public int getColor(){
        return this.color;
    }
    
    
    
    
    public void setPosicion(Posicion nuevaPosicion){
        this.posicion = nuevaPosicion;
    }
    
    public void setDimension (Diemension nuevaDimension){
        this.dimension = nuevaDimension; 
    }
    
    public void setBorde (Borde nuevoBorde){
        this.borde = nuevoBorde;
    }
    
    
    public void setColor(int nuevoValor){
        if(nuevoValor<0){
            System.out.println("Error: EL numero debe ser mayor o igual a 0...");
            return;
        }
           
        this.color = nuevoValor;
    }
    
    public void dibujar(PApplet p){
        p.stroke(this.borde.getColor());
        p.strokeWeight(this.borde.getAncho());
        p.fill(this.color);
        float origenX = this.posicion.getX();
        float origenY = this.posicion.getY();
        int pixelesBase = this.dimension.getAncho();
        int pixelesAltura = this.dimension.getAlto();
        
        p.rect(origenX, origenY, pixelesBase, pixelesAltura);
        
    }
    
}
