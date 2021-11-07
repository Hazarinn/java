package excecao.personalizadaB;

@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends Exception {
	
	private String  nomeDoAtributo;
	
	public NumeroForaIntervaloException(String nomeDoAtributo) {
		
		this.nomeDoAtributo =  nomeDoAtributo;
		
	}
	
	@Override
	public String getMessage() {
		
		return String.format("o atributo '%s' está fora do intervalo", nomeDoAtributo);
	}

}
