package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 2;
		d1.mes = 2;
		d1.ano = 1996;
		
		Data d2 = new Data();
		d2.dia = 31;
		d2.mes = 1;
		d2.ano = 1995;
		
		
		
		System.out.printf("%d/%d/%d",d1.dia, d1.mes, d1.ano);
		System.out.printf("%d/%d/%d",d2.dia, d2.mes, d2.ano);
				
		
	}

}
