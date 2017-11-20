public class Empregado extends Pessoa {

	Empregado() {}
	
	double salario;
	int perc;

	public double getPerc() {
		return perc;
	}

	public void setPerc(int perc) {
		this.perc = perc;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	double obterLucros ()
	{
		salario = 1000*(perc/100);
		return salario;
	}
	
	void  validaPerc () throws Exception 
	{
		if (perc<0 || perc>21 )
		{
			throw new Exception ("Porcentagem incorreta.");
		}
	}
	
	void validaIdade () throws Exception 
	{
		if (getIdade() < 15)
		{
			throw new Exception ("Idade incorreta.");
		}
	}
		double obterPerc ()
		{
			perc = (perc/21)*100;
			return perc;
			
	
		}
	}


