/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tela;
import java.awt.*;
import javax.swing.*;

public class BotonRedondeado extends JButton {

    private Color fondo;
    private Color borde;

    public BotonRedondeado(String texto, Color fondo, Color borde) {
        super(texto);
        this.fondo = fondo;
        this.borde = borde;
    

        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
        setOpaque(false);
        setForeground(new Color(128, 70, 55));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
public BotonRedondeado() {
    this("", new Color(185, 120, 104),
             new Color(185, 120, 104));
}
    
@Override
protected void paintComponent(java.awt.Graphics g) {
    java.awt.Graphics2D g2 = (java.awt.Graphics2D) g.create();

    g2.setRenderingHint(
        java.awt.RenderingHints.KEY_ANTIALIASING,
        java.awt.RenderingHints.VALUE_ANTIALIAS_ON
    );

    g2.setColor(fondo);
    g2.fillRoundRect(0, 0, getWidth() - 1,
                     getHeight() - 1, 12, 12);

    g2.setColor(borde);
    g2.drawRoundRect(0, 0, getWidth() - 1,
                     getHeight() - 1, 12, 12);

    g2.dispose();
    super.paintComponent(g);
}

}

