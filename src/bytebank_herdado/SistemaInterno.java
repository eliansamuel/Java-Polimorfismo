package bytebank_herdado;

public class SistemaInterno {
	
	private int senha = 2222;
	
	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		if (autenticou) { 
			System.out.println("Permis�o Concedida!");
		} else {
			System.out.println("Permiss�o Negada!");
		}
	}
}
