/**
 * 
 */

/**
 * @author Pareja 9 Hugo Elvira 15249 y Edgar Ramírez 15236
 * @version 11/08/2016
 * @descripcion: permite poder usar como de tipo AbstractList los distintos tipos de lista
 */

public abstract class AbstractList<E> implements I_List<E> {
	
	protected int count;
	
	/**
	 * 
	 */
	public int size(){
		return count;	
	}

}
