package util.persistencia;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ManagerBDTxt {
	
	private ManagerBDTxt instance = new ManagerBDTxt();
	
	private ManagerBDTxt() {}
	
	public ManagerBDTxt getInstance() {
		return this.instance;
	}
	
	public void create(Object obj) {
		try {
			String file = obj.getClass().getSimpleName();
			BufferedReader br = new BufferedReader(new FileReader(file));
			
//			br
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public void research() {}
	public void update() {}
	public void delete() {}
	
}
