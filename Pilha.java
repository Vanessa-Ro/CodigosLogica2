import java.util.LinkedList;
import java.util.List;

public class Pilha {
	
	private List<String> nomes = new LinkedList<String>();
	
	public void push(String nome) {
		nomes.add(nome);
	}

	public String pop() {
		return nomes.remove(nomes.size()-1);
	}
	
	public boolean vazia() {  // operação para quando a pilha está vazia. Pode ser feita de duas maneiras: 
		return nomes.isEmpty(); // 1ª é comparar o tamanho com zero -> return nomes.size() == 0;
	}                             // 2ª é usar o método -> return nomes.isEmpty(); 
	
	public String toString() {
		return nomes.toString();
	}
}
