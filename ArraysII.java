import javax.swing.JOptionPane;

public class ArraysII {

	public static void main(String[] args) {
		String [] paises = new String[8];
		/*paises[0] = "Panama";
		paises[1] = "Colombia";
		paises[2] = "Perú";
		paises[3] = "Ecuador";
		paises[4] = "Bolivia";
		paises[5] = "Guatemala";
		paises[6] = "Belice";
		paises[7] = "Venezuela";*/
		
		//String [] paises = {"Panama", "Colombia", "Perú", "Ecuador", "Bolivia", "Guatemala", "Belice", "Venezuela"}; 
				
		/*for (int i = 0; i < paises.length; i++) {
			System.out.println("País " + (i+1) + " " + paises[i]);
		}*/
		
		for (int i = 0; i < 8; i++) {
			paises[i] = JOptionPane.showInputDialog("Introduce país: " + (i + 1));
		}
		
		for(String elemento: paises) {
			System.out.println("País: " + elemento);
		}
	}

}
