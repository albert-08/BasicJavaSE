package oop;

public class Vehiculo {

	public static void main(String[] args) {
		Coche miCoche = new Coche();
		miCoche.setColor("Rojo");

		Furgoneta miFurgoneta = new Furgoneta(7, 580);
		miFurgoneta.setColor("azul");
		miFurgoneta.setAsientos("Si");
		miFurgoneta.setClimatizador("Si");

		System.out.println(miCoche.getString() + miCoche.getColor());
		System.out.println(miFurgoneta.getString() + miFurgoneta.getString());
	}

}
