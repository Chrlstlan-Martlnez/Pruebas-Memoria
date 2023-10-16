package pruebasmemoria;

import javax.swing.ImageIcon;

public class Carta {
    int valor;
    boolean visible;
    ImageIcon img;
    Carta siguiente;
    
    Carta(int valor, ImageIcon img) {
        this.valor = valor;
        this.img = img;
        this.siguiente = null;
    }
}
