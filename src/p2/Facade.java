package p2;

import java.util.List;

import p2.entidades.Livro;

public class Facade {
	
	private static Facade facade;
	
	private Facade(){}
	
	public static Facade getInstance() {
		if(facade == null) facade = new Facade();
		
		return facade;
	}
	
	/* Features especificas */
	public void locar_livro() {
		
	}
	
	public void reservar_livro() {
		
	}
	
	public void renovar_livro() {
		
	}

	/* CRUD Livro */
	
	// Create and Update
	public void save_livro(Livro livro) {
		livro.save();
	}
	
	// Delete
	public void delete_livro(Livro livro) {
		livro.delete();
	}
	
	// Research
	public List<Livro> buscar_livros(String search_text) {
		return Livro.list(search_text);
	}
	
	/* CRUD Aluno */
	
	/* CRUD Funcionario */
	
}
