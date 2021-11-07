package excecao.personalizadaA;

@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException {
	
	private String  nomeDoAtributo;
	
	public StringVaziaException(String nomeDoAtributo) {
		
		this.nomeDoAtributo =  nomeDoAtributo;
		
	}
	
	@Override
	public String getMessage() {
		
		return String.format("o atributo '%s' est� vazio", nomeDoAtributo);
	}

}
