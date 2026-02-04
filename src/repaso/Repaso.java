package repaso;

import processing.core.PApplet;
import models.Borde;
import models.Diemension;
import models.Posicion;
import models.Caja;

public class Repaso extends PApplet {  
    
   Caja caja1;
   Caja caja2;
   
    public static void main(String[] args) {
        
        PApplet.main(Repaso.class);
    }
    
    @Override
    public void settings(){
        size(Config.ANCHO, Config.ALTO);
    }
    
    @Override
    public void setup(){
        caja1 = new Caja();
        caja2 = new Caja();
        
        // Posiciones aleatorias para caja1
        caja1.getPosicion().setX((int)random(0, 600)); 
        caja1.getPosicion().setY((int)random(0, 600)); 
        
        // Posiciones para caja2
        caja2.getPosicion().setX((int)random(0, 600)); 
        caja2.getPosicion().setY((int)random(0, 600)); 
        
  
        caja2.getPosicion().setX(150);
    }
    
    @Override
    public void draw(){
        background(Config.COLOR_FONDO); 
        caja1.dibujar(this);
        caja2.dibujar(this);
    }
}