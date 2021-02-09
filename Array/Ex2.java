import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] x = new int[10];
	
		for(int i= x.length - 1; i>=0; i--) {
			System.out.println("Insira o valor da posição " + i + " do array: ");
				x[i] = sc.nextInt();
		}
		
		for(int i= x.length - 1; i>=0; i--) {
			System.out.println("Posição " + "[" + i + "]" + " = " + x[i]);	
		}
	}
}
