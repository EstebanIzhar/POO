package models;

import processing.core.PApplet;

public class Caja extends Figura {
    private Diemension dimension;
    
    public Caja(int x, int y, int ancho, int alto, int color, Borde borde) {
        super(x, y, color, borde);
        this.dimension = new Diemension(ancho, alto);
    }
    
    @Override
    public void dibujar(PApplet p) {
        p.stroke(borde.getColor());
        p.strokeWeight(borde.getAncho());
        p.fill(color);
        p.rect(posicion.getX(), posicion.getY(), 
               dimension.getAncho(), dimension.getAlto());
    }
    
    public Diemension getDimension() {
        return dimension;
    }
}