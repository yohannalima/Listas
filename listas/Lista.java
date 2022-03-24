package si.p3.listas;

public class Lista {
	
	private static final int ALOCACAO_INICIAL = 3;
	
	private Object[] listaInterna = new Object[ALOCACAO_INICIAL];
	
	private int inseridos;
	
	public void add(Object elemento) throws ValorInvalidoException {
		
		if (elemento == null) {
			throw new ValorInvalidoException();
		}
		
		if (inseridos == listaInterna.length) {
			Object [] novaLista = new Object[(int) (inseridos*2.6)];
			for (int i = 0; i < listaInterna.length; i++) {
				novaLista[i] = listaInterna[i];
			}
			
			listaInterna = novaLista;
		} 
		
		listaInterna[inseridos] = elemento;
		inseridos ++;
	}
	
	
	public void add(int index, Object elemento) throws PosicaoInvalidaException {
		
		if (index < 0 || index >= listaInterna.length) {
			throw new PosicaoInvalidaException();
		} else {
			int penultimo = (listaInterna.length) - 1;
			if (index == penultimo) {
				Object [] novaLista = new Object[(int) (inseridos*2.6)];
				for (int i = 0; i < listaInterna.length; i++) {
					novaLista[i] = listaInterna[i];
				}
				listaInterna = novaLista;
			} 
			
			listaInterna[index] = elemento;
			inseridos += 1;
	    }
		
	}
	
	
	public Object get(int index) throws PosicaoInvalidaException {
		if (index < 0 || index >= listaInterna.length) {
			throw new PosicaoInvalidaException();
		} else {
			return listaInterna[index];
		}
	}
	
	
	public int size() {
		return inseridos;
	}
	
	
	public void clear() {
		inseridos = 0;
		listaInterna = new Object[ALOCACAO_INICIAL];
	}

}
