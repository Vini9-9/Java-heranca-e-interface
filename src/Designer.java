// Designer herda da casse Funcionario
public class Designer extends Funcionario{
	
	
/*	private String login;
	private int senha=0;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	// Autenticador de Senha
	
	public boolean autentica(int senha) {
		System.out.println("G");
		if (this.senha == senha) {
	    	return true;
	    } else {
	        return false;
	    }
	}
	
	
	// Autenticador de login e Senha (Sobrecarga)
	
	public boolean autentica(String login, int senha) {
        //implementacao omitida
	    if (this.senha == senha && this.login == login) {
	        return true;
	    } else {
	        return false;
	    }
		
    }
	*/
	
	
	// Bonificação de Designer
	
	public double getBonificacao() {
		System.out.println("Método bonificação Designer");
		return 200;
	}
	
	
}
