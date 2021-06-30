
public class Manipula_Cadenas {

	public static void main(String[] args) {
		String nombre = "Frida Viridiana";
		System.out.println("Su nombre es " + nombre);
		System.out.println("Su nombre tiene " + nombre.length() + " letras.");
		System.out.println("La primera letra de " + nombre + " es la " + nombre.charAt(0));
		int ultima_letra;
		ultima_letra=nombre.length();
		System.out.println("Y la última letra es la " + nombre.charAt(ultima_letra-1));
	}

}
