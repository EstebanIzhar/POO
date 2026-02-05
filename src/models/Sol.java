package models;

import processing.core.PApplet;
import java.util.ArrayList;

public class Sol {
    private Circulo solCentral;
    private ArrayList<Caja> rayos;
    private Posicion posicion;
    
    public Sol(int x, int y) {
        this.posicion = new Posicion(x, y);
        this.rayos = new ArrayList<>();
        crearSol();
    }
    
    private void crearSol() {
        // CORREGIDO: Usar colores hexadecimales
        solCentral = new Circulo(
            posicion.getX(), 
            posicion.getY(), 
            50, 
            0xFFFFFF00, // Amarillo (FF=alpha, FF=rojo, FF=verde, 00=azul)
            new Borde(3, 0xFF000000) // Negro
        );
        
        // Crear rayos
        int numRayos = 12;
        int largoRayo = 40;
        int anchoRayo = 8;
        
        for (int i = 0; i < numRayos; i++) {
            float angulo = PApplet.radians(i * 30);
            float rayoX = posicion.getX() + PApplet.cos(angulo) * 55;
            float rayoY = posicion.getY() + PApplet.sin(angulo) * 55;
            
            Caja rayo = new Caja(
                (int)rayoX - anchoRayo/2, 
                (int)rayoY - largoRayo/2, 
                anchoRayo, 
                largoRayo, 
                0xFFFFCC00, // Naranja amarillento
                new Borde(1, 0xFF000000)
            );
            
            rayos.add(rayo);
        }
    }
    
    public void dibujar(PApplet p) {
        // Dibujar rayos primero
        for (Caja rayo : rayos) {
            rayo.dibujar(p);
        }
        
        // Dibujar sol central encima
        solCentral.dibujar(p);
    }
    
    public void mover(int dx, int dy) {
        posicion.mover(dx, dy);
        solCentral.mover(dx, dy);
        
        for (Caja rayo : rayos) {
            rayo.mover(dx, dy);
        }
    }
    
    public Posicion getPosicion() {
        return posicion;
    }
    
    public void setPosicion(int x, int y) {
        int dx = x - posicion.getX();
        int dy = y - posicion.getY();
        mover(dx, dy);
    }
}