package bytebank_herdado;

// Gerente eh um Funcionario, Gerente herda da class Funcionario
public class EditorVideo extends Funcionario{
	
	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonificacao do Editor de V�deo");
		return super.getBonificacao() + 100;
	}
	
}
