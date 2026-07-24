/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memoria;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author UTN
 */
public class Tablero {

    private Carta[][] cartas;
    private int filas;
    private int columnas;

   
    private static final String[] IMAGENES = {
        "carta1.png", "carta2.png", "carta3.png", "carta4.png",
        "carta5.png", "carta6.png", "carta7.png", "carta8.png",
        "carta9.png", "carta10.png", "carta11.png", "carta12.png",
        "carta13.png", "carta14.png", "carta15.png", "carta16.png",
        "carta17.png", "carta18.png", "carta19.png", "carta20.png",
        "carta21.png", "carta22.png", "carta23.png", "carta24.png",
        "carta25.png", "carta26.png", "carta27.png", "carta28.png",
        "carta29.png", "carta30.png", "carta31.png", "carta32.png"
    };

    public void inicializar(Nivel nivel) {
        this.filas = nivel.getFilas();
        this.columnas = nivel.getColumnas();
        this.cartas = new Carta[filas][columnas];
        distribuirParejas(nivel.getParejas());
    }

    private void distribuirParejas(int cantidadParejas) {
        List<String> seleccion = new ArrayList<>();
        for (int i = 0; i < cantidadParejas; i++) {
            seleccion.add(IMAGENES[i % IMAGENES.length]);
            seleccion.add(IMAGENES[i % IMAGENES.length]);
        }
        Collections.shuffle(seleccion);

        int indice = 0;
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                cartas[f][c] = new Carta(seleccion.get(indice));
                indice++;
            }
        }
    }

    public Carta getCarta(int fila, int columna) {
        return cartas[fila][columna];
    }

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public boolean compararCartas(Carta c1, Carta c2) {
        return c1.getImagen().equals(c2.getImagen());
    }

    public boolean esJuegoTerminado() {
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                if (!cartas[f][c].isEncontrada()) {
                    return false;
                }
            }
        }
        return true;
    }

    public void reiniciar(Nivel nivel) {
        inicializar(nivel);
    }
}

