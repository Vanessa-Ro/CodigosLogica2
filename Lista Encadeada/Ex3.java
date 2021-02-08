import java.util.LinkedList;

public class Ex3 {

	public static void main(String[] args) {
		
		LinkedList<Integer> lista = new LinkedList<Integer>();
		
		lista.add(10);
		lista.add(5);
		lista.add(8);
		lista.add(7);

		Integer soma = 0;
		for(int i : lista)
			soma += i; //mesma coisa que sum = sum + i;
		
		System.out.println ("O resultado da soma dos nodos da lista é: " + soma);
	}
}
