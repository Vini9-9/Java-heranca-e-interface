
public class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	
	
	// Bonifica��o de 10% do sal�rio
	
	public double getBonificacao() {
		System.out.println("M�todo bonifica��o Funcion�rio Comum");
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
