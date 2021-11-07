package excecao.personalizadaB;

@SuppressWarnings("serial")
public class StringVaziaException extends Exception {
	
	private String  nomeDoAtributo;
	
	public StringVaziaException(String nomeDoAtributo) {
		
		this.nomeDoAtributo =  nomeDoAtributo;
		
	}
	
	@Override
	public String getMessage() {
		
		return String.format("o atributo '%s' est� vazio", nomeDoAtributo);
	}

}
