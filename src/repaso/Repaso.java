package repaso;

import processing.core.PApplet;
import models.*;

public class Repaso extends PApplet {  
    
    Caja caja1;
    Caja caja2;
    Circulo circulo1;
    MinecraftPerson personaje;
    
    public static void main(String[] args) {
        PApplet.main(Repaso.class);
    }
    
    @Override
    public void settings() {
        size(800, 600);
    }
    
    @Override
    public void setup() {
        // Crear cajas simples
        caja1 = new Caja(100, 100, 80, 60, color(255, 0, 0), new Borde(3, 0));
        caja2 = new Caja(300, 200, 100, 80, color(0, 255, 0), new Borde(2, 0));
        
        // Crear círculo
        circulo1 = new Circulo(500, 150, 40, color(0, 0, 255), new Borde(4, 0));
        
        // Crear personaje Minecraft
        personaje = new MinecraftPerson(400, 400);
    }
    
    @Override
    public void draw() {
        background(200); // Fondo gris simple
        
        // Dibujar todas las figuras
        caja1.dibujar(this);
        caja2.dibujar(this);
        circulo1.dibujar(this);
        personaje.dibujar(this);
        
        // Mover la caja1 automáticamente
        caja1.mover(1, 0);
        if (caja1.getPosicion().getX() > width) {
            caja1.getPosicion().setX(-80);
        }
    }
    
    @Override
    public void mousePressed() {
        // Cambiar color de la caja2 al hacer clic
        caja2.setColor(color(random(255), random(255), random(255)));
        
        // Mover personaje al lugar del clic
        personaje.setPosicion(mouseX, mouseY);
    }
}