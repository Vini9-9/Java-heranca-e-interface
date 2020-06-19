
public class ControleBonificacao {

	
	private double soma;
	
	public void registra(Funcionario f) {
	    double boni = f.getBonificacao();
	    this.soma = this.soma + boni;
	    System.out.println(this.soma);
	}
	
	public double getSoma() {
		return soma;
	}
	
	
	
	
}
