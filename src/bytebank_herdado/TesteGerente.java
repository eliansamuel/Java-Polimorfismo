package bytebank_herdado;

public class TesteGerente {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		
		g1.setNome("Marco");
		g1.setCpfString("111.111.111-11");
		g1.setSalario(5000);;
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpfString());
		System.out.println(g1.getSalario());
		
		g1.setSenha(2222);
		boolean autenticou = g1.autentica(2222);
		
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
		
		
	}
}
