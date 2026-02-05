package models;

import processing.core.PApplet;

public abstract class Figura {
    protected Posicion posicion;
    protected int color;
    protected Borde borde;
    
    public Figura(int x, int y, int color, Borde borde) {
        this.posicion = new Posicion(x, y);
        this.color = color;
        this.borde = borde;
    }
    
    public abstract void dibujar(PApplet p);
    
    public void mover(int dx, int dy) {
        posicion.mover(dx, dy);
    }
    
    public Posicion getPosicion() {
        return posicion;
    }
    
    public void setColor(int color) {
        this.color = color;
    }
}