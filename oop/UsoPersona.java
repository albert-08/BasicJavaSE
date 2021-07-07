package oop;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoPersona {
  public static void main(String[] args) {
    Persona[] lasPersonas = new Persona[2];
    lasPersonas[0] = new Empleado2("Frida Benitez", 5000, 2009, 02, 25);
    lasPersonas[1] = new Alumno("Daniela Arizmendi", "Biotecnología");

    for (Persona persona : lasPersonas) {
      System.out.println(persona.getNombre() + ", " + persona.getDescription());
    }
  }
}

abstract class Persona {
  private String nombre;

  public Persona(String nom) {
    nombre = nom;
  }

  //GETTERS

  public String getNombre() {
    return nombre;
  }

  public abstract String getDescription();
}

class Empleado2 extends Persona {
  private double sueldo;
  private Date altaContrato;
  private int Id;
  private static int IdSiguiente = 1;

  public Empleado2(String nom, double sue, int agno, int mes, int dia) {
    super(nom);

    sueldo = sue;

    GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);

    altaContrato = calendario.getTime();

    Id = IdSiguiente;
    IdSiguiente ++;
  }

  //GETTERS

  public double getSueldo() {
    return sueldo;
  }

  public Date getFechaContrato() {
    return altaContrato;
  }

  public String getDescription() {
    return "Este empleado tiene un Id = " + Id + " con un sueldo = " + sueldo;
  }

  //SETTERS

  public void subeSueldo(double porcentaje) {
    double aumento = sueldo*porcentaje/100;
    sueldo += aumento;
  }
}

class Alumno extends Persona {
  private String carrera;
  
  public Alumno(String nom, String car) {
    super(nom);

    carrera = car;
  }

  public String getDescription() {
    return "Este alumno está estudioando la carrera de " + carrera;
  }
}