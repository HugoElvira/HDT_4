/**
 * 
 */

/**
 * @author Pareja 9 Hugo Elvira 15249 y Edgar Ramírez 15236
 * @version 11/08/2016
 * @descripcion: interface para la listas
 * @param <E>
 */
public interface I_List<E> {
	
	int size();
	void addFirst(E value);
	public E removeFirst();
	public E removeLast();
	public void addLast(E value);
	public E getFirst();
	public E getLast();
	public boolean contains(E value);

}
