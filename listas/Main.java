package si.p3.listas;

public class Main {

	public static void main(String[] args) {
		
		Lista teste = new Lista();
		
		try {
			teste.add(null);
		} catch (ValorInvalidoException e1) {
			System.out.println("Valor Inv�lido.");
		}
		
		try {
			teste.add(0, "Teste");
			teste.add(1, "Yohanna");
			teste.add(2, "Lima");
		} catch (PosicaoInvalidaException e) {
			System.out.println("Posi��o Inv�lida.");
		}
		
		try {
			System.out.println(teste.get(2));
		} catch (PosicaoInvalidaException e) {
			System.out.println("Posi��o Inv�lida.");
		}
		
		try {
			teste.add(2, "ABC");
		} catch (PosicaoInvalidaException e) {
			System.out.println("Posi��o Inv�lida.");
		}
		
		try {
			System.out.println(teste.get(2));
		} catch (PosicaoInvalidaException e) {
			System.out.println("Posi��o Inv�lida.");
		}
		
		try {
			System.out.println(teste.get(3));
		} catch (PosicaoInvalidaException e) {
			System.out.println("Posi��o Inv�lida.");
		}

	}

}
