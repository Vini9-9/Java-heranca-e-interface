// o polimorfismo permite usar referências mais genéricas para a comunicação com um objeto;
public class TestaReferencias {

	public static void main(String[] args) {
		
		Funcionario f = new Gerente();
		
		//Gerente n = new Funcionario();
		//não funciona pois a referência tem que ser 'mãe' ou igual ao objeto
		
		
		//f.autentica(2222); 
		//não funciona pois não tem o método 'autentica' na classe 'Funcionario', para resolver basta alterar a referência para a classe 'Gerente'
		
		
		Gerente g1 = new Gerente();
        g1.setSalario(5000.0);

        EditorVideo ev = new EditorVideo();
        ev.setSalario(2500.0);

        Designer d = new Designer();
        d.setSalario(2000.0);

        ControleBonificacao controle = new ControleBonificacao();
      
/*       Ao registrar o Gerente observamos que o seu método passa pelo funcionário comum
         pois essa regra deve-se ao seu Gerente.getBonificacao(): 
         Bonificação de funcionário comum + salário de Gerente
*/        
        controle.registra(g1);
        
        //Bonificação EditorVideo: 150
        
        controle.registra(ev);
        
        //Bonificação EditorVideo: 200
        
        controle.registra(d);

        System.out.println(controle.getSoma());
		
		
		
	}
	
	
}
