package bytebank_herdado;

// n�o podemos mais inst�nciar dessa classe, pq ela � abstrata
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	
	// m�todo sem corpo, sem implementa��o aqui( as classes filhas podem implemetar)
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
