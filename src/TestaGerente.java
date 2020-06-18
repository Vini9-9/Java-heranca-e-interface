
public class TestaGerente {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
        g1.setNome("Marco");
        g1.setCpf("235568413");
        g1.setSalario(5000.0);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());

        g1.setSenha(2222);
        g1.setLogin("g1");
        
        
        //Teste de sobrecarga
        
        boolean autenticouSenha = g1.autentica(2222);

        System.out.println(autenticouSenha);
        
        boolean autenticouLoginESenha = g1.autentica("g1",2222);
		
        System.out.println(autenticouSenha);
        
        
        
        System.out.println(g1.getBonificacao());
        

	}

}
