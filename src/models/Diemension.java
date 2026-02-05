package models;

public class Diemension {
    private int ancho;
    private int alto;
    
    public Diemension(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    
    public int getAncho() {
        return ancho;
    }
    
    public int getAlto() {
        return alto;
    }
    
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    
    public void setAlto(int alto) {
        this.alto = alto;
    }
}