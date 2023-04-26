
//gerente é um funcionario. Gerente herda da classe Funcionario
public class Designer extends Funcionario {
	
	public double getbonificacao() {
		System.out.println("Chamando o método de bonificacao designer");
		return 200;
	}
	

}
