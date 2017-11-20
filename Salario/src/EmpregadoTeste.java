
public class EmpregadoTeste {

	public  static void main (String [] args ) {
		int i=0;
		
		while (i==0){
		try {
		Empregado e = new Empregado ();
		
		e.setAltura(180);
		
		e.setIdade(2);
		e.validaIdade();
		e.setNome("Jonatas");
		e.setPerc(22);
		e.obterPerc();
		e.validaPerc();
		e.obterLucros();
		
		System.out.println("Funcionário: " + e.getNome() );
		System.out.println("Idade:" + e.getIdade() );
		System.out.println("Altura: " + e.getAltura());
		System.out.println("Porcentagem de dias trabalhados: " + e.getPerc() + "% " );
		
		System.out.println("Lucros: " + e.getSalario() );
	
		i=1;
		}
		
		
		
		catch (  Exception e) {
			i=0;
			System.out.println(e.getMessage());
		}
		
}
}
	
}
