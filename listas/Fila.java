package si.p3.listas;

public class Fila {
	
	private static final int ALOCACAO_INICIAL = 3;
	
	private Object[] filaInterna = new Object[ALOCACAO_INICIAL];
	
	private int inseridos;
	
	public void enqueue(Object elemento) throws ValorInvalidoException {
		
		if (elemento == null) {
			throw new ValorInvalidoException();
		}
		
		if (inseridos == filaInterna.length) {
			
			Object [] novaFila = new Object[(int) (inseridos*1.6)];
			for (int i = 0; i < filaInterna.length; i++) {
				novaFila[i] = filaInterna[i];
			}
			
			filaInterna = novaFila;
        }
        
		filaInterna[inseridos] = elemento;
        inseridos++;
	}
	
	
	public Object dequeue() {
		 
		if (inseridos == 0) {
			return "Fila vazia.";
		} else {
			Object filaTemp = filaInterna[0];
			inseridos--;
			Object [] novaFila = new Object[filaInterna.length];
			for (int i = 0; i < (filaInterna.length-1); i++) {
				novaFila[i] = filaInterna[i+1];
			}
			
			filaInterna = novaFila;
			
			return filaTemp;
		}
		
	}
	
	public int size() {
		return inseridos;
	}
	
	public void clear() {
		inseridos = 0;
		filaInterna = new Object[ALOCACAO_INICIAL];
	}
	
	
	
	
	
	
	public Object get(int index) throws PosicaoInvalidaException {
		if (index < 0 || index >= filaInterna.length) {
			throw new PosicaoInvalidaException();
		} else {
			return filaInterna[index];
		}
	}
}
