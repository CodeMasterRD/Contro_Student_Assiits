/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import javax.swing.JFrame;

/**
 *
 * @author israe
 */
public class CerrarJF {
    private JFrame frame;

    // Constructor que recibe la referencia del JFrame
    public CerrarJF(JFrame frame) {
        this.frame = frame;
    }

    // Método para cerrar el JFrame
    public void cerrarJFrame() {
        if (frame != null) {
            frame.dispose(); // Cierra la ventana
            System.out.println("JFrame cerrado desde otra clase test3.");
        }
    }
}
