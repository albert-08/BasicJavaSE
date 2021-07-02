package oop;

public class Pruebas {
  public static void main(String[] args) {
    Empleados trabajador1 = new Empleados("Frida");
    Empleados trabajador2 = new Empleados("Daniela");
    Empleados trabajador3 = new Empleados("Mariza");
    Empleados trabajador4 = new Empleados("Alejandra");

    trabajador1.setSeccion("Ventas");

    System.out.println(trabajador1.getDatos() + "\n" + trabajador2.getDatos() +
      "\n" + trabajador3.getDatos() + "\n" + trabajador4.getDatos());
    
    System.out.println(Empleados.getIdSiguiente());
  }
}

class Empleados {
  private final String nombre;
  private String seccion;
  private int Id;
  private static int IdSiguiente = 1;

  public Empleados(String nom) {
    nombre = nom;
    seccion = "Administración";
    Id = IdSiguiente;
    IdSiguiente++;
  }

  //Setters

  public void setSeccion(String seccion) {
    this.seccion = seccion;
  }

  //Getters

  public String getDatos() {
    return "El nombre es: " + nombre + " la sección es " + seccion + " y el Id = " + Id;
  }

  public static String getIdSiguiente() {
    return "El IdSiguiente es: " + IdSiguiente;
  }
}