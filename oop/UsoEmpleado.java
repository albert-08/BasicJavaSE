package oop;

import java.util.Arrays;
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

        Jefatura jefe_RRHH = new Jefatura("Frida", 1803, 1996, 03, 18);
        jefe_RRHH.setIncentivo(1803);

        Empleado[] misEmpleados = new Empleado[6];
        misEmpleados[0] = new Empleado("Frida Benitez", 3000, 1996, 04, 18);
        misEmpleados[1] = new Empleado("Daniela Valdez", 6000, 1995, 11, 06);
        misEmpleados[2] = new Empleado("Mariza Cisneros", 3000, 1993, 03, 18);
        misEmpleados[3] = new Empleado("Flor Estevez", 47500, 2009, 11, 9);
        misEmpleados[4] = jefe_RRHH; //Polimorfismo en acción. Princípio de sustitución
        misEmpleados[5] = new Jefatura("Natalia", 2000, 2018, 8, 8);

        Jefatura jefa_Finanzas = (Jefatura) misEmpleados[5];
        jefa_Finanzas.setIncentivo(5000);
        System.out.println(jefa_Finanzas.tomarDecisiones("Dar más días de vacaciones a los empleados"));
        
        System.out.println("El Jefe " + jefa_Finanzas.getNombre() + " tiene un bonus de: " + jefa_Finanzas.setBonus(500));

        System.out.println(misEmpleados[3].getNombre() + " tiene un bonus de: " + misEmpleados[3].setBonus(200));
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

        Arrays.sort(misEmpleados);

        for (Empleado empleado : misEmpleados) {
            System.out.println("Nombre: " + empleado.getNombre()
            + " Id: " + empleado.getId()
            + " Sueldo: " + empleado.getSueldo()
            + " Fecha de Alta: " + empleado.getFechaContrato());
        }
    }
}

class Empleado implements Comparable, Trabajadores {

    private String nombre;
    private double sueldo;
    private Date altaContrato;
    private int Id;
    private static int IdSiguiente = 0;

    public Empleado(String nom, double sue, int agno, int mes, int dia) {
        nombre = nom;
        sueldo = sue;

        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);

        altaContrato = calendario.getTime();
        
        ++ IdSiguiente;
        Id = IdSiguiente;
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

    public int getId() {
        return Id;
    }

    //SETTERS

    public void subeSueldo(double porcentaje) {
        double aumento = sueldo*porcentaje/100;
        sueldo += aumento;
    }

    public int compareTo(Object miObjeto) {
        Empleado otroEmpleado = (Empleado) miObjeto;

        if (this.sueldo < otroEmpleado.sueldo) {
            return -1;
        }

        if (this.sueldo > otroEmpleado.sueldo) {
            return 1;
        }

        return 0;
    }

    @Override
    public double setBonus(double gratificacion) {
        return Trabajadores.bonusBase + gratificacion;
    }
}

class Jefatura extends Empleado implements Jefes {
    private double incentivo;

    public Jefatura(String nom, double sue, int agno, int mes, int dia) {
        super(nom, sue, agno, mes, dia);
    }

    public String tomarDecisiones(String decision) {
        return "Un miembro de la dirección ha tomado la decisión de: " + decision;
    }

    public double setBonus(double gratificacion) {
        double prima = 2000;
        return Trabajadores.bonusBase + gratificacion + prima;
    }

    //SETTERS

    public void setIncentivo(double b) {
        incentivo = b;
    }

    //GETTERS

    public double getSueldo() {
        double sueldoJefe = super.getSueldo();
        return sueldoJefe + incentivo;
    }    
}