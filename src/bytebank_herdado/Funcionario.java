package bytebank_herdado;

// não podemos mais instânciar dessa classe, pq ela é abstrata
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	
	// método sem corpo, sem implementação aqui( as classes filhas podem implemetar)
	public abstract double getBonificacao();

	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpfString() {
		return this.cpf;
	}
	public void setCpfString(String cpfString) {
		this.cpf = cpfString;
	}
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
