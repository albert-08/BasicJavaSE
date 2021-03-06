public class HelloWorld {
  //Upper Camel Case
  public static void main(String[] args) {
    System.out.println("Hola mundo!" + args[0]);

    //Enteros
    byte edad = 127; //1 byte
    short year = -32768; //2 bytes 
    int id_user = 1000;  //4 bytes
    long id_twitter = 1234567890123456789L;//8 bytes

    //Punto Flotante
    float diametro = 34.25F; //4 bytes
    double precio = 123456.1234567890; //8 bytes

    //Texto
    char genero = 'M'; //2bytes

    //Lógico
    boolean isVisible = false; //2 bytes

    //Nombre variables
    //Java es sensible a mayúsculas y minúsculas.
    //Pueden comenzar con _ o $
    //No pueden comenzar con numeros
    //Las constantes se escriben en Mayúsculas
    //CamelCase -Uper Camel Case para los nombres de las clases y nombres de archivos, 
    //es decir que la primera letra que escriba debe ser mayúscula. 
    //Lower Camel Case - para nombres de variables, objetos y metodos, 
    //quiere decir que la primera letra que escriba debe ser en minúscula.

    int variable = 2;
    int _variable = 3;
    int $variable = 4;
    int variable1 = 5;

    //Constantes
    int VALOR = 0;
    int VALOR_MAXIMO = 1;

    //Lower Camel Case
    int minValor = 4;

    //Cast
    byte b = 6;
    short s = b;

    b = (byte) s;

    int i = 1;
    double d = 2.5;
    i = (int) d;

    int codigo = 97;
    char codigoASCII = (char) codigo;

    short numero = 256;
    byte numeroByte = (byte) numero;
    
    //Arrays
    //Declaración de array

    int[] arregloInt = new int[3];
    double arregloDouble[];

    int[][] array2D = new int[2][3];
    int[][][] array3D = new int[3][3][2];
    int[][][][] array4D = new int[1][2][3][4];

    char[][] days = { {'M', 'T', 'W'}, {'M', 'T', 'W'}};

    char[][][] words = { {{'a', 'b', 'b'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}}};

    char[] names = new char[4];
    names[0] = 'h';
    names[1] = 'o';
    names[2] = 'l';
    names[3] = 'a';
    System.out.println(names[0]);
    System.out.println(names[1]);
    System.out.println(names[2]);
    System.out.println(names[3]);

    char[][][][] monkey = new char[2][3][2][2];
    monkey[1][0][0][1] = 'm';
    System.out.println(monkey[1][0][0][1]);

    //Operadores Aritméticos
    int a = 1;
    int aa = a + a;
    System.out.println("El valor de aa: " + aa);

    double x = 2.56;
    int y = 9;
    float w = (float)x + y;
    System.out.println(w);

    System.out.println(w*2);

    double k = 4/0.00002;
    System.out.println(k);

    System.out.println(7%2);
    
    int f = 2;
    int g = 3;
    //f = f + g;
    f += g;
    System.out.println(f);

    int l = 3;
    l++;
    System.out.println(l++);
    ++l;
    System.out.println(++l);
  
    //Opereadores de equidad
    int q = 5;
    int p = 4;
    System.out.println(q == p);
    System.out.println(q != p);

    //Operadores relacionales
    System.out.println("q > p ->" + (q > p));
    System.out.println("q < p ->" + (q < p));

    System.out.println("q >= p ->" + (q >= p));
    System.out.println("q <= p ->" + (q <= p));

    //Operadores lógicos
    boolean n = false;
    boolean m = true;

    System.out.println("n && m -> " + (n && m));
    System.out.println("n || m -> " + (n || m));
    System.out.println("!n -> " + (!n));
    System.out.println("!m -> " + (!m));

    //Control de Flujo
    //If/else

    if (q > p) {
      //true
      System.out.println("Si es mayor");
    } else if (q == p) {
      System.out.println("Es igual");
    } else {
      System.out.println("No es mayor, y no es igual");
    }

    //Switch

    int mes = 3;

    switch (mes) {
      case 1:
        System.out.println("Enero");
        break;
      case 2:
        System.out.println("Febrero");
        break;
      case 3:
        System.out.println("Marzo");
        break;
      case 4:
        System.out.println("Abril");
        break;
      case 5:
        System.out.println("Mayo");
        break;
      case 6:
        System.out.println("Junio");
        break;
      case 7:
        System.out.println("Julio");
        break;
      case 8:
        System.out.println("Agosto");
        break;
      case 9:
        System.out.println("Septiembre");
        break;
      case 10:
        System.out.println("Octubre");
        break;
      case 11:
        System.out.println("Noviembre");
        break;
      case 12:
        System.out.println("Diciembre");
        break;
      default:
        System.out.println("No existe ese mes");
        break;
    }

    //Bucle While
    int e = 1;
    while (e <= 5) {
      System.out.println("e es menor o igual que 5");
      e++;
    }

    System.out.println();
    int[] numeros = new int[5]; 
    for (int c = 0; c < 5; c++) {
      numeros[c] = c;
      System.out.println("números["+c+"]: " + numeros[c]);  
    }

    for (int j : numeros) {
      System.out.println(j);
    }

    System.out.println("Continuamos con el flujo");

  }
}