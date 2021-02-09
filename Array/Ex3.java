
public class Ex3 {

	public static void main(String[] args) {

		int x[][] = new int [100][100];
		
		for(int i=0; i < x.length; i++) {
			for(int j=0; j < x.length; j++) {
				x[i][j] = i - j;
			}
		}
		
		System.out.println("Subtração dos índices: ");

		for(int i=0; i < x.length; i++) {
			for(int j=0; j < x[i].length; j++) {
				System.out.println(x[i][j]);
			}
		}
		
		for(int i=0; i < x.length; i++) {
			for(int j=0; j < x[i].length; j++) {
				x[i][j] = x[i][j] * 7;
			}
		}
		
		System.out.println("\n\nMultiplicação dos índices: ");

		for(int i=0; i < x.length; i++) {
			for(int j=0; j < x[i].length; j++) {
				System.out.print(x[i][j]);
			}
		}
	}	
}
