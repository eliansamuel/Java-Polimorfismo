package bytebank_herdado;

// Gerente eh um Funcionario, Gerente herda da class Funcionario
public class Gerente extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonificacao do Gerente");
		return super.getSalario();
	}
	
}
