// Gerente herda da casse Funcionario
public class Gerente extends Funcionario{

	private int senha=0;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	// Autenticador de Senha
	
	public boolean autentica(int senha) {
	    if (this.senha == senha) {
	        return true;
	    } else {
	        return false;
	    }
	}
	
	
	
}
