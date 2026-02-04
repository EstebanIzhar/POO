package models;

public class Posicion {
    private int x;
    private int y;
    
    public Posicion(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Posicion() {
        this.x = 0;
        this.y = 0;
    }
    
    // Getters y Setters
    public int getX() {
        return this.x;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    // Método para establecer ambas coordenadas a la vez
    public void setPosicion(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    // Método para mover la posición
    public void mover(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
    
    @Override
    public String toString() {
        return "Posicion [x=" + x + ", y=" + y + "]";
    }
}