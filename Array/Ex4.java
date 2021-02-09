
public class Ex4 {

	public static void main(String[] args) {

		int x[][] = new int [50][100];
		
		for(int i= x.length - 1; i>=0; i--) {
			for(int j=0; j < x.length; j++) {
				x[i][j] = i + j;
			}
		}
		
		System.out.println("O array ficou da seguinte forma: ");

		for(int i= x.length - 1; i>=0; i--) {
			for(int j=0; j < x.length; j++) {
				System.out.print(i + "|" + j + "=" + x[i][j] + "\t");
			}
				System.out.println("\n");
		}
	}
}
