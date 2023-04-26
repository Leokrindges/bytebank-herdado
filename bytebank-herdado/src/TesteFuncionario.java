
public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario leo = new Gerente();
		leo.setNome("Leo Krindges");
		leo.setCpf("111.111.111-11");
		leo.setSalario(2600.00);
		
		Cliente cliente = new Cliente();
		
		System.out.println(leo.getNome());
		System.out.println(leo.getbonificacao());
		
		//leo.salario = 300.0;
	}

}
