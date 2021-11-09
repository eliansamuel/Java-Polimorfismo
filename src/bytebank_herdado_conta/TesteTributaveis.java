package bytebank_herdado_conta;

public class TesteTributaveis {
	public static void main(String[] args) {
		
		ContaCorrente cc1 = new ContaCorrente(222, 333);
		cc1.deposita(100.0);
		
		SeguroVida sv1 = new SeguroVida();
		
		CalculadorImposto ci1 = new CalculadorImposto();
		ci1.registra(cc1);
		ci1.registra(sv1);
		
		System.out.println(ci1.getTotalImposto());
		
	}
}
