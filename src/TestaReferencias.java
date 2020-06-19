// o polimorfismo permite usar refer�ncias mais gen�ricas para a comunica��o com um objeto;
public class TestaReferencias {

	public static void main(String[] args) {
		
		Funcionario f = new Gerente();
		
		//Gerente n = new Funcionario();
		//n�o funciona pois a refer�ncia tem que ser 'm�e' ou igual ao objeto
		
		
		//f.autentica(2222); 
		//n�o funciona pois n�o tem o m�todo 'autentica' na classe 'Funcionario', para resolver basta alterar a refer�ncia para a classe 'Gerente'
		
		
		Gerente g1 = new Gerente();
        g1.setSalario(5000.0);

        EditorVideo ev = new EditorVideo();
        ev.setSalario(2500.0);

        Designer d = new Designer();
        d.setSalario(2000.0);

        ControleBonificacao controle = new ControleBonificacao();
      
/*       Ao registrar o Gerente observamos que o seu m�todo passa pelo funcion�rio comum
         pois essa regra deve-se ao seu Gerente.getBonificacao(): 
         Bonifica��o de funcion�rio comum + sal�rio de Gerente
*/        
        controle.registra(g1);
        
        //Bonifica��o EditorVideo: 150
        
        controle.registra(ev);
        
        //Bonifica��o EditorVideo: 200
        
        controle.registra(d);

        System.out.println(controle.getSoma());
		
		
		
	}
	
	
}
