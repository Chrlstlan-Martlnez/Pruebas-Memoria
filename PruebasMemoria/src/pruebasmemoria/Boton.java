package pruebasmemoria;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Boton extends JButton implements ActionListener{
    
    Boton(ImageIcon imagen){
        this.addActionListener(this);
        this.setIcon(imagen);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        this.setBackground(Color.BLACK);
    }
    
    Boton(ImageIcon imagen, Dimension tamano){
        this.addActionListener(this);
        this.setIcon(imagen);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        this.setBackground(Color.BLACK);
        this.setPreferredSize(tamano);
    }

    public void actionPerformed(ActionEvent e) {
        
    }
}
