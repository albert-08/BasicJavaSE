import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class UsoTallas {
  //enum Talla {MINI, MEDIANO, GRANDE, MUY_GRANDE};

  enum Talla {
    MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");

    private String abreviatura;

    private Talla(String abreviatura) {
      this.abreviatura = abreviatura;
    }

    public String getAbreviatura() {
      return abreviatura;
    }
  }

  public static void main(String[] args) {
    /* Talla s = Talla.MINI;
    Talla m = Talla.MEDIANO;
    Talla l = Talla.GRANDE;
    Talla xl = Talla.MUY_GRANDE;   */

    Scanner entrada = new Scanner(System.in);

    System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUY_GRANDE");

    String entrada_datos = entrada.next().toUpperCase();

    Talla la_talla = Enum.valueOf(Talla.class, entrada_datos);

    System.out.println("Talla = " + la_talla);

    System.out.println("Abrebiatura = " + la_talla.getAbreviatura());
  }
}