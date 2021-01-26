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
	
	public boolean vazia() {  // opera��o para quando a pilha est� vazia. Pode ser feita de duas maneiras: 
		return nomes.isEmpty(); // 1� � comparar o tamanho com zero -> return nomes.size() == 0;
	}                             // 2� � usar o m�todo -> return nomes.isEmpty(); 
	
	public String toString() {
		return nomes.toString();
	}
}
