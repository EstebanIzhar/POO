package models;

import processing.core.PApplet;

public class MinecraftPerson {
    private Caja cabeza;
    private Caja cuerpo;
    private Caja brazoIzq;
    private Caja brazoDer;
    private Caja piernaIzq;
    private Caja piernaDer;
    private Posicion posicion;
    
    public MinecraftPerson(int x, int y) {
        this.posicion = new Posicion(x, y);
        crearPersonaje();
    }
    
    private void crearPersonaje() {
        // Usar colores hexadecimales simples
        int colorPiel = 0xFFE0B48C;
        int colorAzul = 0xFF0064C8;
        int colorGris = 0xFF323232;
        
        cabeza = new Caja(
            posicion.getX() - 15, 
            posicion.getY() - 30, 
            30, 
            30, 
            colorPiel,
            new Borde(1, 0)
        );
        
        cuerpo = new Caja(
            posicion.getX() - 15, 
            posicion.getY(), 
            30, 
            40, 
            colorAzul,
            new Borde(1, 0)
        );
        
        brazoIzq = new Caja(
            posicion.getX() - 30, 
            posicion.getY(), 
            15, 
            40, 
            colorAzul,
            new Borde(1, 0)
        );
        
        brazoDer = new Caja(
            posicion.getX() + 15, 
            posicion.getY(), 
            15, 
            40, 
            colorAzul,
            new Borde(1, 0)
        );
        
        piernaIzq = new Caja(
            posicion.getX() - 15, 
            posicion.getY() + 40, 
            15, 
            40, 
            colorGris,
            new Borde(1, 0)
        );
        
        piernaDer = new Caja(
            posicion.getX(), 
            posicion.getY() + 40, 
            15, 
            40, 
            colorGris,
            new Borde(1, 0)
        );
    }
    
    public void dibujar(PApplet p) {
        // Dibujar en orden
        piernaIzq.dibujar(p);
        piernaDer.dibujar(p);
        cuerpo.dibujar(p);
        brazoIzq.dibujar(p);
        brazoDer.dibujar(p);
        cabeza.dibujar(p);
    }
    
    public void mover(int dx, int dy) {
        posicion.mover(dx, dy);
        cabeza.mover(dx, dy);
        cuerpo.mover(dx, dy);
        brazoIzq.mover(dx, dy);
        brazoDer.mover(dx, dy);
        piernaIzq.mover(dx, dy);
        piernaDer.mover(dx, dy);
    }
    
    public void setPosicion(int x, int y) {
        int dx = x - posicion.getX();
        int dy = y - posicion.getY();
        mover(dx, dy);
    }
    
    public Posicion getPosicion() {
        return posicion;
    }
}