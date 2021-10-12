package classe;

public class ValorVsReferencia {
	
	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // Atribui��o por valor, pois estou trabalhando com tipo (primitivo)
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; // Atribui��o por referencia, pois estou trabalhando com (Objeto)
		
		d1.dia = 31;
		d2.mes = 12;
		
		d1.ano = 2025;
		
	System.out.println(d1.obterDataFormatada());	
	System.out.println(d2.obterDataFormatada());
	
	voltarDataParaValorPadrao(d1);
	
	System.out.println(d1.obterDataFormatada());	
	System.out.println(d2.obterDataFormatada());
		
	}
	
	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
		
		int c = 5;
		
		alterarPrimitivo(c);
		System.out.println(c);
		
	}
	
	static void alterarPrimitivo(int a) {
		a++;
		
	}

}
