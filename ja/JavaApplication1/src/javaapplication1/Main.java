package javaapplication1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        int alto = 0;
        int ancho = 0; //Aunque tendrán el mismo valor, uso 2 variables para que se entienda mejor.
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Este programa mostrará una matriz identidad. Debe ingresar las dimensiones de la matriz "
                + "(Por definición, esta siempre va a ser cuadrada).");
        
        while (alto < 1) {        //-<<<- Por si el usuario ingresa un número entero inválido -<<<-
            try {
                System.out.print("Ingrese alto y ancho (Debe ser un número entero mayor a 0)=> ");
                alto = scanner.nextInt();
            }
            //-vvv- Por si el usuario ingresa un tipo de dato inválido (Letras o decimales) -vvv-
            catch (InputMismatchException Error) {
                System.out.println("Debes ingresar un número entero (F6 para volver a intentar)");
                System.exit(0);
            }
        }
        
        scanner.close();
        ancho = alto;
        
        //-vvv- La primera fila -vvv-
        System.out.print("[1]");
        for (int i = 1; (i < ancho); i+=1) {
            System.out.print("[0]");
            if (i == ancho-1) {
                System.out.println("");
            }
        }
        
        //-vvv- Las demás -vvv-
        for (int i = 1; (i < alto); i+=1) {
            for (int j = 0; (j < i); j+=1) {
                System.out.print("[0]");
            }
            System.out.print("[1]");
            for (int j = i+1; (j < ancho); j+=1) {
                System.out.print("[0]");
            }
            System.out.println("");
        }
    }
    
}
