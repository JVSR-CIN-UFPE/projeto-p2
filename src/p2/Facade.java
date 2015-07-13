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

	public List<Livro> search_books(String search_text) {
		return Livro.list(search_text);
	}

	public void save_book(Livro livro) {
		livro.save();
	}
	
}
