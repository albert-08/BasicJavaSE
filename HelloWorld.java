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

    System.out.println(numeroByte);
  }
}