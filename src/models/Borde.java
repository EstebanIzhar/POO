package models;

public class Borde {
    private int ancho;
    private int color;
    
    public Borde(int ancho, int color) {
        this.ancho = ancho;
        this.color = color;
    }
    
    public int getAncho() {
        return ancho;
    }
    
    public int getColor() {
        return color;
    }
}