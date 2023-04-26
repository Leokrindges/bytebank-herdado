
public class Administrador extends Funcionario implements Autenticavel{

 private AutenticaçãoUtil autenticador;
 
 public Administrador() {
	 this.autenticador = new AutenticaçãoUtil();
 }
	
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
	@Override
	public double getbonificacao() {
		return 50;
	}

}
