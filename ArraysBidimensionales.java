
public class ArraysBidimensionales {

	public static void main(String[] args) {
		//int [][] matrix = new int[3][4];
		
		int [][] matrix = {
				{10, 15, 18, 19, 21},
				{5, 25, 37, 41, 15},
				{7, 19, 32, 14, 90},
				{85, 2, 7, 40, 27}
		};
		
		/*for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) Math.round(Math.random()*100);
			}
		}*/
		
		/*for (int i = 0; i < matrix.length; i++) {
			System.out.println();
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
		}*/
		
		for (int[] num: matrix) {
			System.out.println();
			for (int n: num) {
				System.out.print(n + " ");
			}
		}
	}

}
