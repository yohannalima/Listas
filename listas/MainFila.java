package si.p3.listas;

public class MainFila {

	public static void main(String[] args) {
		
		Fila novaFila = new Fila();
		
		try {
			novaFila.enqueue("Yohanna");
		} catch (ValorInvalidoException e) {
			System.out.println("Valor Inválido.");
		}
		try {
			novaFila.enqueue("Lima");
		} catch (ValorInvalidoException e) {
			System.out.println("Valor Inválido.");
		}
		
		System.out.println(novaFila.dequeue());
		
		try {
			System.out.println(novaFila.get(0));
		} catch (PosicaoInvalidaException e) {
			System.out.println("...");
		}

	}

}
