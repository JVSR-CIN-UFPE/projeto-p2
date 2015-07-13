package p2.gui;

import java.util.Scanner;

import p2.Facade;

public abstract class Tela {
	
	Tela _focus = null;
	
	boolean _terminate = false;
	
	Scanner input = new Scanner(System.in);
	
	Facade facade = Facade.getInstance();
	
	public Tela() {
		this._focus = this;
	}
	
	public void run() {
		while(true) {
			_focus.launch();
		}
	}
	
	public abstract void launch();
	
}