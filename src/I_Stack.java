/**
 * 
 */

/**
 * @author Grupo 8 Hugo Elvira, Dieter de Wit, Gerardo Cardoza
 * @version 25/07/2016
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
