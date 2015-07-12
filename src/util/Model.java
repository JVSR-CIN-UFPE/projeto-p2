package util;

import java.util.List;
import java.util.Vector;

public abstract class Model {
	
	private Integer _id;
	
	public void save() {
		
		System.out.println(getClass());
		
	}
	
	public static void delete() {
		
	}
	
	public static List list(Object... filters) {
		
		// Before: Connect DB
		
		// After: Disconnect DB
		
		return new Vector();
	}
}
