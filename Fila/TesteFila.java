import java.util.Queue; //Queue é uma interface.
import java.util.LinkedList;

public class TesteFila {

	public static void main(String[] args) {

		Fila fila = new Fila();
		
		fila.adiciona("Maurício");
		fila.adiciona("Guilherme");
		
		System.out.println(fila);

		String x1 = fila.remove();
		
		System.out.println(x1);
		System.out.println(fila);
		
		Queue<String> FilaDoJava = new LinkedList<String>();
		
			FilaDoJava.add("Maurício");      
			String x2 = FilaDoJava.poll(); //retrira.
			
		System.out.println(x2);
		System.out.println(fila);
	}
}
