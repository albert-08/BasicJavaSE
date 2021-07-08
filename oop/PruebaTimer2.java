package oop;

import javax.swing.*;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;

public class PruebaTimer2 {
    public static void main(String[] args) {
        Clock miClock = new Clock(3000, true);
        miClock.enMarcha();

        JOptionPane.showMessageDialog(null, "Pulsa aceptar para terminar");
        System.exit(0);
    }
}

class Clock {
    private int intervalo;
    private boolean sonido;

    public Clock(int intervalo, boolean sonido) {
        this.intervalo = intervalo;
        this.sonido = sonido;
    }

    public void enMarcha() {
        ActionListener listener = new GetHora2();
        Timer miTimer = new Timer(intervalo, listener);
        miTimer.start();
    }

    private class GetHora2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Date now = new Date();
            System.out.println("Te pongo la hora cada 3 seg " + now);

            if (sonido) {
                Toolkit.getDefaultToolkit().beep();
            }
        }
        
    }
} 