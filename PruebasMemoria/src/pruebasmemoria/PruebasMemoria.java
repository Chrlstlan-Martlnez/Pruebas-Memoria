package pruebasmemoria;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

public class PruebasMemoria {

    public static void main(String[] args) {
        ImageIcon icono = new ImageIcon("imgsMc\\mesa.png");
        ImageIcon logoImg = new ImageIcon("imgsMc\\logo.png");
        ImageIcon fondoImg = new ImageIcon("imgsMc\\inventario.png");
        ImageIcon salirImg = new ImageIcon("imgsMc\\quit.jpg");
        ImageIcon manualImg = new ImageIcon("imgsMc\\manual.png");
        ImageIcon sonidosImg = new ImageIcon("imgsMc\\sonidos.png");
        ImageIcon musicaImg = new ImageIcon("imgsMc\\musica.png");
        ImageIcon j1Img = new ImageIcon("imgsMc\\steve.png");
        ImageIcon j2Img = new ImageIcon("imgsMc\\alex.png");
        
        Ventana ventanaPrincipal = new Ventana("Memoria", new Color(0x6E3700), icono, new Dimension(1000,600), 20);
        
        Panel panelSuperior = new Panel(new Dimension(70,70), new Color(0x6E3700));
        Panel panelInferior = new Panel(new Dimension(70,70), new Color(0x6E3700));
        Panel panelIzquierda = new Panel(new Dimension(100,100), new Color(0xA86E34), true, BorderFactory.createLineBorder(new Color(0x3D1F00), 10, false), new FlowLayout(FlowLayout.LEADING));
        Panel panelDerecha = new Panel(new Dimension(100,100), new Color(0xA86E34), true, BorderFactory.createLineBorder(new Color(0x3D1F00), 10, false), new FlowLayout());
        Panel panelCentro = new Panel(new Dimension(0,0), new Color(0x6E3700), new FlowLayout());
        
        Panel tablero = new Panel(new Dimension(0,0), new Color(0xffffff), false, BorderFactory.createEmptyBorder(10, 10, 10, 10), new FlowLayout());
        
        Panel panelMarcador = new Panel(new Dimension(0,0), new Color(0x6E3700), true, BorderFactory.createLineBorder(new Color(0x3D1F00), 10, true), new BorderLayout());
        Panel panelLogo = new Panel(new Dimension(250,250), new Color(0x6E3700));
        Panel panelFinalizar = new Panel(new Dimension(250,250), new Color(0x6E3700));
        
        Panel panelTemas = new Panel(new Dimension(0,0), new Color(0x6E3700), true, BorderFactory.createLineBorder(new Color(0x3D1F00), 10, true), new BorderLayout());
        Panel panelManual = new Panel(new Dimension(175,175), new Color(0x6E3700));
        Panel panelSonido = new Panel(new Dimension(175,175), new Color(0x6E3700), new FlowLayout(FlowLayout.CENTER,10,0));
        
        Label fondoTablero = new Label(fondoImg, new Color(0x6E3700), new Dimension(725,365));
        
        Label cartaA1 = new Label(j1Img, new Color(0xA86E34), new Dimension(55,55));
        Label cartaA2 = new Label(j1Img, new Color(0xA86E34), new Dimension(55,55));
        Label cartaA3 = new Label(j1Img, new Color(0xA86E34), new Dimension(55,55));
        Label cartaA4 = new Label(j1Img, new Color(0xA86E34), new Dimension(55,55));
        Label cartaA5 = new Label(j1Img, new Color(0xA86E34), new Dimension(55,55));
        Label cartaA6 = new Label(j1Img, new Color(0xA86E34), new Dimension(55,55));
        
        Label j1Puntos = new Label("JUGADOR 1", new Color(0xA86E34), new Color(0X000099), new Dimension(150,50), j1Img);
        Label j2Puntos = new Label("JUGADOR 2", new Color(0xA86E34), new Color(0X990000), new Dimension(150,50), j2Img);
        Label versus = new Label("8 VS 8", new Color(0xA86E34), new Color(0xffffff), new Dimension(50,50));
        
        Label logo = new Label(logoImg, new Color(0x6E3700), new Dimension(100,100));
        Boton salir = new Boton(salirImg);
        Boton manual = new Boton(manualImg);
        Boton sonidos = new Boton(sonidosImg, new Dimension(62,62));
        Boton musica = new Boton(musicaImg, new Dimension(62,62));
        
        
        
        ventanaPrincipal.add(panelSuperior, BorderLayout.NORTH);
        ventanaPrincipal.add(panelInferior, BorderLayout.SOUTH);
        ventanaPrincipal.add(panelIzquierda, BorderLayout.WEST);
        ventanaPrincipal.add(panelDerecha, BorderLayout.EAST);
        ventanaPrincipal.add(panelCentro, BorderLayout.CENTER);
        
        
        panelSuperior.add(panelMarcador, BorderLayout.CENTER);
        panelSuperior.add(panelLogo, BorderLayout.WEST);
        panelSuperior.add(panelFinalizar, BorderLayout.EAST);
        
        panelInferior.add(panelTemas, BorderLayout.CENTER);
        panelInferior.add(panelManual, BorderLayout.WEST);
        panelInferior.add(panelSonido, BorderLayout.EAST);
        
        panelCentro.add(fondoTablero);
        fondoTablero.add(tablero);
        
        panelIzquierda.add(cartaA1);
        panelIzquierda.add(cartaA2);
        panelIzquierda.add(cartaA3);
        panelIzquierda.add(cartaA4);
        panelIzquierda.add(cartaA5);
        panelIzquierda.add(cartaA6);
        
        panelLogo.add(logo, BorderLayout.CENTER);
        logo.setHorizontalAlignment(Label.CENTER);
        logo.setFont(new Font("MS Gothic", Font.PLAIN, 40));
        
        panelFinalizar.add(salir);
        panelManual.add(manual);
        panelSonido.add(sonidos);
        panelSonido.add(musica);
        
        panelMarcador.add(j1Puntos, BorderLayout.WEST);
        j1Puntos.setHorizontalTextPosition(Label.RIGHT);
        j1Puntos.setHorizontalAlignment(Label.LEFT);
        j1Puntos.setFont(new Font("MS Gothic", Font.BOLD, 15));
        panelMarcador.add(j2Puntos, BorderLayout.EAST);
        j2Puntos.setHorizontalTextPosition(Label.LEFT);
        j2Puntos.setHorizontalAlignment(Label.RIGHT);
        j2Puntos.setFont(new Font("MS Gothic", Font.BOLD, 15));
        panelMarcador.add(versus, BorderLayout.CENTER);
        versus.setHorizontalAlignment(Label.CENTER);
        versus.setFont(new Font("MS Gothic", Font.BOLD  , 35));
        
        
        
        Carta carta1 = new Carta(1, j1Img);
        Carta carta2 = new Carta(2, j2Img);
        Carta carta3 = new Carta(3, j2Img);
        Carta carta4 = new Carta(4, j2Img);
        Carta carta5 = new Carta(5, j2Img);
        
        Pila pilaCartas = new Pila();
        
        pilaCartas.agregarPareja(carta1);
        pilaCartas.agregarPareja(carta2);
        pilaCartas.agregarPareja(carta3);
        pilaCartas.agregarPareja(carta4);
        pilaCartas.agregarPareja(carta5);
        
        pilaCartas.mostrar();
        
        
        
        ventanaPrincipal.setVisible(true);
    }

    
}
