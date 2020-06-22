
public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero){
	     super(agencia, numero);
	}

	@Override //Cobrando uma taxa no saque
	public boolean saca(double valor) {
		double taxa = 0.2;
		System.out.println("Essa operação tem uma taxa de " + taxa);
		return super.saca(valor+taxa);
	}
	
	
}


