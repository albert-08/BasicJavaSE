package oop;

import javax.swing.JOptionPane;

public class Uso_Coche {

	public static void main(String[] args) {
		Coche miCoche = new Coche();
		miCoche.setColor(JOptionPane.showInputDialog("Introduce color: "));
		miCoche.setAsientos(JOptionPane.showInputDialog("Quiére asientos de cuero?"));
		miCoche.setClimatizador(JOptionPane.showInputDialog("Quiére climatizador?"));
		
		System.out.println(miCoche.getString());
		System.out.println(miCoche.getColor());
		System.out.println(miCoche.getAsientos());
		System.out.println(miCoche.getClimatizador());
		System.out.println(miCoche.getPesoCoche());
		System.out.println("El precio final del coche es: " + miCoche.getPrecioCoche());
	}

}
