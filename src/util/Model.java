package util;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Vector;

public class Model implements Serializable {
	
	public void save() {
		for(Field f : this.getClass().getDeclaredFields()) {
			f.setAccessible(true);
//			System.out.println(f.getName());
		}
	}
	
	
	public static void delete() {}
	
	@SuppressWarnings("rawtypes")
	public static List list(Object... filters) {
		
		// Before: Connect DB
		
		// After: Disconnect DB
		
		return new Vector();
	}
}
