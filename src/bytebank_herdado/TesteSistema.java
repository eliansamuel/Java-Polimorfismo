package bytebank_herdado;

public class TesteSistema {
	
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setSenha(2222);
		
		Administrador adm1 = new Administrador();
		adm1.setSenha(3333);
		
		Cliente c1 = new Cliente();
		c1.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g1);
		si.autentica(adm1);
		si.autentica(c1);
	}

}
