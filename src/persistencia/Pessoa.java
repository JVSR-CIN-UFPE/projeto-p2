package persistencia;

import java.io.Serializable;

public class Pessoa implements Serializable {
	
	private Integer id_db;
	
	public String nome;
	
	public int idade;
	
	public Pessoa() {}
	
	public Pessoa(String name) {this.nome = name;}
	
	public Pessoa(String name, int idade) {this.nome = name; this.idade = idade;}
	
	public void save() {
		// Save object...
	}
	
	
}
