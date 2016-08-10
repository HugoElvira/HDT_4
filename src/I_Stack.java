/**
 * 
 */

/**
 * @author Pareja 9 Hugo Elvira 15249 y Edgar Ramírez 15236
 * @version 11/08/2016
 * @descripcion: interface para la pila
 * @param <E>
 */

public interface I_Stack<E> {
	
	public void Push(E element);
	public E Pop();
	public boolean IsEmpty();
	public int Size();
	public E get();

}
