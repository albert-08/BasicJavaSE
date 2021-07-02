package oop;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoEmpleado {
    public static void main(String[] args) {
        /*Empleado empleado = new Empleado("Frida Benitez", 3000, 1996, 04, 18);
        Empleado empleado2 = new Empleado("Daniela Valdéz", 6000, 1995, 11, 06);
        Empleado empleado3 = new Empleado("Mariza Cisneros", 3000, 1993, 03, 18);

        empleado.subeSueldo(5);
        empleado2.subeSueldo(5);
        empleado3.subeSueldo(5);

        System.out.println("Nombre: " + empleado.getNombre() + " Sueldo: " + empleado.getSueldo()
        + " Fecha de Alta: " + empleado.getFechaContrato());
        System.out.println("Nombre: " + empleado2.getNombre() + " Sueldo: " + empleado2.getSueldo()
        + " Fecha de Alta: " + empleado2.getFechaContrato());
        System.out.println("Nombre: " + empleado3.getNombre() + " Sueldo: " + empleado3.getSueldo()
        + " Fecha de Alta: " + empleado3.getFechaContrato());*/

        Empleado[] misEmpleados = new Empleado[4];
        misEmpleados[0] = new Empleado("Frida Benitez", 3000, 1996, 04, 18);
        misEmpleados[1] = new Empleado("Daniela Valdez", 6000, 1995, 11, 06);
        misEmpleados[2] = new Empleado("Mariza Cisneros", 3000, 1993, 03, 18);
        misEmpleados[3] = new Empleado("Flor Estevez");

        /*for (int i = 0; i < misEmpleados.length; i++) {
            misEmpleados[i].subeSueldo(5);
        }*/

        for (Empleado empleado : misEmpleados) {
            empleado.subeSueldo(5);
        }

        /*for (int i = 0; i < misEmpleados.length; i++) {
            System.out.println("Nombre: " + misEmpleados[i].getNombre()
            + " Sueldo: " + misEmpleados[i].getSueldo()
            + " Fecha de Alta: " +misEmpleados[i].getFechaContrato());
        }*/

        for (Empleado empleado : misEmpleados) {
            System.out.println("Nombre: " + empleado.getNombre()
            + " Sueldo: " + empleado.getSueldo()
            + " Fecha de Alta: " + empleado.getFechaContrato());
        }
    }
}

class Empleado {

    private String nombre;
    private double sueldo;
    private Date altaContrato;

    public Empleado(String nom, double sue, int agno, int mes, int dia) {
        nombre = nom;
        sueldo = sue;

        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);

        altaContrato = calendario.getTime();
    }

    public Empleado(String nom) {
        this(nom, 3000, 2000, 02, 02);
    }

    //GETTERS

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Date getFechaContrato() {
        return altaContrato;
    }

    //SETTERS

    public void subeSueldo(double porcentaje) {
        double aumento = sueldo*porcentaje/100;
        sueldo+=aumento;
    }
}