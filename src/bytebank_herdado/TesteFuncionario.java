package bytebank_herdado;

public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Gerente();
		
		funcionario1.setNome("Elian");
		funcionario1.setCpfString("222.222.222-22");
		funcionario1.setSalario(5000);
		
		System.out.println("O funcionário " + funcionario1.getNome()
				+ " terá uma bonificação de R$ "
				+ funcionario1.getBonificacao());
		
		
	}
}
