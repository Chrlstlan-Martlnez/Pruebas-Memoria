package pruebasmemoria;

public class Pila {
    Carta tope;
    
    Pila() {
        this.tope = null;
    }
    
    public boolean vacio() {
        return tope == null;
    }
    
    public void agregar(Carta nuevaCarta) {
        if (tope == null) {
            tope = nuevaCarta;
        }
        else {
            nuevaCarta.siguiente = tope;
            tope = nuevaCarta;
        }
    }
    
    public void agregarPareja(Carta nuevaCarta) {
        Carta temp = new Carta(nuevaCarta.valor, nuevaCarta.img);
        
        this.agregar(nuevaCarta);
        this.agregar(temp);
    }
    
    public void mostrar() {
        if (this.vacio()) {
            System.out.println("La pila está vacía");
        }
        else {
            while (tope != null) {
                System.out.print(tope.valor +" -> ");
                tope = tope.siguiente;
//                System.out.println(tope);
//                System.out.println(tope.siguiente);
            }
            System.out.println("null");
        }
    }
}
