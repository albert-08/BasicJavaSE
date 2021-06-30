
public class Arrays {

	public static void main(String[] args) {
		/*int [] matriz = new int[4];
		int matriz2[] = new int[4];
		
		matriz[0] = 4;
		matriz[1] = 3;
		matriz[2] = 7;
		matriz[3] = 92;*/
		
		int [] matriz = {4, 3, 7, 14, 92, 95, 85, 65, 25, 14, 78, 85, 65, 12, 45, 78, 78, 95, 23};
		
		for (int i = 0; i < matriz.length; i ++) {
			System.out.println("Valor del índice " + i + " = " + matriz[i]);
		}
	}

}
