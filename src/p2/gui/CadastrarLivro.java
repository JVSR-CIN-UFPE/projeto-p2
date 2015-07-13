package p2.gui;

import p2.entidades.Livro;

public class CadastrarLivro extends Tela {
	
	@Override
	public void launch(){
		
		System.out.println("Informe os dados do livro:");
		
		System.out.print("Titulo: ");
		String title = this.input.nextLine();
		
		System.out.print("Autor: ");
		String author = this.input.nextLine();
		
		System.out.println("A) Cadastrar\nB) Cancelar\nC) Voltar");
		String command = this.input.nextLine();
		
		if(command.equalsIgnoreCase("A")) {
			this.facade.save_book(new Livro(title, author));
		}
		else if(command.equalsIgnoreCase("B")) {
			// Re-launch view
		}
		else if(command.equalsIgnoreCase("C")) {
			this._focus = new TelaInicial();
		}
		else {
			System.out.println("Invalid command!");
		}
	}
}
