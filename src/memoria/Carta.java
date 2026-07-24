/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memoria;

/**
 *
 * @author josea
 */
public class Carta {
    private final String imagen; // nombre de archivo, ej: "carta1.png"
    private boolean visible;
    private boolean encontrada;
 
    public Carta(String imagen) {
        this.imagen = imagen;
        this.visible = false;
        this.encontrada = false;
    }
 
    public String getImagen() {
        return imagen;
    }
 
    public boolean isVisible() {
        return visible;
    }
 
    public void setVisible(boolean visible) {
        this.visible = visible;
    }
 
    public boolean isEncontrada() {
        return encontrada;
    }
 
    public void marcarEncontrada() {
        this.encontrada = true;
        this.visible = true;
    }
 
    public void ocultar() {
        if (!encontrada) {
            this.visible = false;
        }
    }
}

