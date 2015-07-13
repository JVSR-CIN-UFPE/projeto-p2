import p2.entidades.Livro;

public class Main {
	
	public static void main(String[] args) {
		
		new Livro("Java como programar", "Alguem").save();
		new Livro("Meu livro", "Jaca").save();
		new Livro("LoL", "Lil").save();
		
		System.out.println(Livro.list().size());
		System.out.println(Livro.list("Ja").size());
		
	}
}
