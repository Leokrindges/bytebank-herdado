
//gerente é um funcionario. Gerente herda da classe Funcionario, assina o contrato autenticavel, e é um autenticavel
public class Gerente extends Funcionario implements Autenticavel{
	
	private AutenticaçãoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticaçãoUtil();		
	}
	
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
	public double getbonificacao() {
		System.out.println("Chamando o método de bonificacao Gerente");
		return super.getSalario();
	}
	

}
