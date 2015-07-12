package p2.gui;

import java.util.Scanner;

import p2.Facade;

public abstract class Tela {
	
	Tela _focus = this;
	
	Scanner input = new Scanner(System.in);
	
	Facade facade = Facade.getInstance();
	
	public Tela() {}
	
	public Tela(Tela tela) {
		this._focus = tela;
	}
	
	public void run() {
		while(_focus == this) {
			launch();
		}
	}
	
	public abstract void launch();
	
}
