package bytebank_herdado;

public class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	
	public double getBonificacao() {
		return this.salario * 0.1;
	}

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