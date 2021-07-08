package oop;

import javax.swing.JOptionPane;
import javax.swing.Timer;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.Date;

public class PruebaTimer {
    public static void main(String[] args) {
        GetHora listener = new GetHora();
        //ActionListener listener = new GetHora();
        Timer miTimer = new Timer(5000, listener);
        miTimer.start();
        JOptionPane.showMessageDialog(null, "Pulsa Aceptar para detener");
        System.exit(0);
    }
}

class GetHora implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        Date now = new Date();
        System.out.println("Te pongo la hora cada 5 seg: " + now);
        
        Toolkit.getDefaultToolkit().beep();
    }
  
}