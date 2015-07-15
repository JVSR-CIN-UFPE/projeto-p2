package p2.entidades;

import util.Model;

public class Livro extends Model {

	private Integer _id;
	
	private String _titulo;
	
	private String _autor;
	
	public Livro(String title, String author) {
		this._titulo = title;
		this._autor = author;
	}

	public Integer get_id() {
		return _id;
	}

	public void set_id(Integer _id) {
		this._id = _id;
	}

	public String get_titulo() {
		return _titulo;
	}

	public void set_titulo(String _titulo) {
		this._titulo = _titulo;
	}

	public String get_autor() {
		return _autor;
	}

	public void set_autor(String _autor) {
		this._autor = _autor;
	}
	
	@Override
	public String toString() {
		return this._id + "; " + this._titulo + "; " + this._autor;
	}
}
