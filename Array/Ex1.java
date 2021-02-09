
public class Ex1 {

	public static void main(String[] args) {

		int[] x = new int [9];
		
		for(int i=0; i < x.length; i++) {
			x[i] = i;
		}
		
		System.out.println("\nO array ficou da segunite forma:\n");

		for(int i=0; i < x.length; i++) {
		System.out.println("Posição " + "[" + i + "]" + " = " + x[i]);
		}
		
		System.out.println("\nElementos multiplicados por 3:\n");
		
		for(int i=0; i < x.length; i++) {
			int mult;
			mult = x[i] * 3;
			System.out.println("Posição " + "[" + i + "]" + " = " + mult);
		}
	}
}
