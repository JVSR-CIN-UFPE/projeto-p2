package p2.gui;

import java.util.List;
import java.util.Vector;

import p2.entidades.Livro;

public class ConsultarLivro extends Tela {
	
	List<Livro> livros = new Vector<Livro>();
	
	@Override
	public void launch() {
		
		System.out.println("Digite um texto para filtar a busca e aperte <ENTER>:");
		
		String search_text = this.input.nextLine();
		
		livros = facade.buscar_livros(search_text);
	}
}
