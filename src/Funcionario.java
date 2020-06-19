
public class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	
	
	// Bonificação de 10% do salário
	
	public double getBonificacao() {
		System.out.println("Método bonificação Funcionário Comum");
	    return this.salario * 0.1;
	}
	
	// Getters and Setters
	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

	
	
	
}
