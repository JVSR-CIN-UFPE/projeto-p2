package p2.gui;

public class TelaInicial extends Tela {
	
	public void launch() {
		System.out.println("Selecione a operação:" +
				"\nA) Consultar" +
				"\nB) Login" +
				"\nC) Cadastrar");
		String operacao = this.input.nextLine();
		
		if(operacao.equalsIgnoreCase("A")) {
			this._focus = new ConsultarLivro();
		}
		else if(operacao.equalsIgnoreCase("B")) {
			this._focus = new Login();
		}
		else if(operacao.equalsIgnoreCase("C")) {
			this._focus = new CadastrarLivro();
		}
	}
}
