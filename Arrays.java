public class Arrays {
  public static void main(String[] args) {
 
    //Definimos un array de 3 filas x 5 columnas
    int array[][][]={{{1, 2},{2, 3},{3, 4},{4, 5},{5, 6}}, {{6, 7},{7, 8},{8, 9},{9, 10},{10, 11}}, {{11, 12},{12, 13},{13, 14},{14, 15},{15,16}}};

    //Recorremos el array multidimensional
    for (int i=0;i<array.length;i++){
      for (int j=0;j<array[0].length;j++){
        for (int k=0;k<array[0][0].length;k++) {
          System.out.println(array[i][j][k]);
        }     
      }
    }

    //Recorremos el array multidimensional
    System.out.println("ForEach");
    for (int[][] arrayInterno : array){
      for (int numero[]: arrayInterno){
        for (int num : numero) {
          System.out.println(num);
        }
      }
    }
  }
}