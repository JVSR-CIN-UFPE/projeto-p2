import p2.entidades.Livro;

public class Main {
	
	public static void main(String[] args) {
		
		new Livro("Java como programar", "Deitel").save();
		new Livro("C", "Dennis Ritchie").save();
		new Livro("Sherlock Holmes", "Arthur Conan Doyle").save();
		
		System.out.println(Livro.list().size());
		System.out.println(Livro.list("Ja").size());
		
	}
}
