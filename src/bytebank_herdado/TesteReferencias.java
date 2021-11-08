package bytebank_herdado;

public class TesteReferencias {
	public static void main(String[] args) {
				
		// Parte esquerda é a parte mais generica, que engloba mais coisas e a da direita a que engloba menos.
		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(9000.0);
		
		Funcionario f1 = new Funcionario();
		f1.setSalario(2000.0);
		
		EditorVideo ev1 = new EditorVideo();
		ev1.setSalario(7000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f1);
		controle.registra(ev1);
		
		System.out.println(controle.getSoma());
	
	}

}
