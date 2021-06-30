
public class ArraysIII {

	public static void main(String[] args) {
		int[] matriz = new int[150];
		
		for (int i = 0; i < matriz.length; i++) {
			matriz[i] = (int)Math.round(Math.random()*100);
		}
		
		for (int numeros: matriz) {
			System.out.print(numeros + " ");
		}
	}

}
