import java.util.LinkedList;

public class Ex4 {

	public static void main(String[] args) {
		
		LinkedList<Integer> lista = new LinkedList<Integer>();
		
		lista.add(10);
		lista.add(50);
		lista.add(25);
		lista.add(7);
		
		Integer maior = 0;
			for(int i : lista) {
				if(maior < i)
					maior = i;
			}
			
		System.out.println("O maior nodo é: " + maior);
	}
}
