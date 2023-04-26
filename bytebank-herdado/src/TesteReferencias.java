
public class TesteReferencias {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("je");
		g1.setSalario(5000.00);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500);
		
		Designer d = new Designer();
		d.setSalario(2000);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registro(g1);
		controle.registro(ev);
		controle.registro(d);
		
		System.out.println(controle.getSoma());
	}

}
