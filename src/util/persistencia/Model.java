package util;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Vector;

@SuppressWarnings("serial")
public class Model implements Serializable {
	
	private Integer __internal_id__;
	
	public void save() {}
	
	public static void update() {}
	
	public static void delete() {}
	
	@SuppressWarnings("rawtypes")
	public static List list(Object... filters) {
		
		// Before: Connect DB
		
		// After: Disconnect DB
		
		return new Vector();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Model)) return false;
		return equals(this.__internal_id__.equals(((Model)obj).__internal_id__));
	}
}
