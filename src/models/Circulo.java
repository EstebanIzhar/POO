package models;
import processing.core.PApplet;

public class Circulo extends Figura {
    private float radio;
    
    public Circulo(int x, int y, float radio, int color, Borde borde){
        super(x, y, color, borde);
        this.radio = radio;
    }
    @Override
    public void dibujar(PApplet p){
        p.stroke(borde.getColor());
        p.strokeWeight(borde.getAncho());
        p.fill(color);
        p.ellipse(posicion.getX(), posicion.getY(), radio * 2, radio * 2);
    }
}