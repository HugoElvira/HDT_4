/**
 * 
 */

/**
 * @author Pareja 9 Hugo Elvira 15249 y Edgar Ram�rez 15236 (solo modificamos algunas cosas)
 * @version 11/08/2016
 * @description: Nodo (codigo reutilizado de internet con fines universitarios, autor original JULIO)
 */

public class Node<E> { 
	protected E data; // value stored in this element 
	protected Node<E> nextElement; // ref to next
	
	/**
	 * @param v
	 * @param next
	 */
	public Node(E v, Node<E> next) {
	// pre: v is a value, next is a reference to remainder of list 
	// post: an element is constructed as the new head of list 
		data = v;
		nextElement = next;
	}

	/**
	 * @param v
	 */
	public Node(E v) {
	// post: constructs a new tail of a list with value v  
		this(v,null); 
	}
	
	/**
	 * @return
	 */
	public Node<E> next() {
	// post: returns reference to next value in list  
		return nextElement; 
	}
	
	/**
	 * @param next
	 */
	public void setNext(Node<E> next) {
	// post: sets reference to new next value  
		nextElement = next; 
	}

	/**
	 * @return
	 */
	public E value() {
	// post: returns value associated with this element  
		return data; 
	}
	
	/**
	 * @param value
	 */
	public void setValue(E value) {
	// post: sets value associated with this element  
		data = value; 
	}
}
