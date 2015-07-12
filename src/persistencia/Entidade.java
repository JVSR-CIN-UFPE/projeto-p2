package persistencia;
import java.util.List;

public abstract class Entidade<T> {
	
	public void save(){}
	
	public void delete(){}
	
	public T list(){return null;}
	
	public List<T> listAll(){return null;}
	
}
