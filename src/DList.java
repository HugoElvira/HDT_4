/**
 * 
 */

/**
 * @author Pareja 9 Hugo Elvira 15249 y Edgar Ramírez 15236
 * @version 11/08/2016
 */

public class DList<E> extends AbstractList<E> {
	

	protected DoubleNode<E> head;
	protected DoubleNode<E> tail;

	/**
	 * 
	 */
	public DList() {
		// TODO Auto-generated constructor stub
		head = null;
		tail = null;
		count = 0;
	}


	/**
	 * @
	 */
	@Override
	public void addFirst(E value) {
		// TODO Auto-generated method stub
		head = new DoubleNode<E>(value,head,null);	
		
		if (tail == null){
			tail = head;
		}
		count ++;
	}


	/**
	 * @
	 */
	@Override
	public E removeFirst() {
		// TODO Auto-generated method stub
		DoubleNode<E> temp = head;
		head = head.next();
		count--;
		return temp.value();
	}


	/**
	 * @see InterfazLista#removeLast()
	 */
	@Override
	public E removeLast() {
		// TODO Auto-generated method stub
		DoubleNode<E> temp = tail;
		tail = tail.previous();
		if(tail == null){
			head = null;
		}
		else{
			tail.setNext(null);
		}
		count--;
		return temp.value();
	}


	/**
	 * @
	 */
	@Override
	public void addLast(E value) {
		// TODO Auto-generated method stub
		
		tail = new DoubleNode<E>(value,null,tail);
		
		if(head == null){
			head = tail;
		}
		count++;
		
	}


	/**
	 * @
	 */
	@Override
	public E getFirst() {
		// TODO Auto-generated method stub
		return head.value();
	}


	/**
	 * @
	 */
	@Override
	public E getLast() {
		// TODO Auto-generated method stub
		return tail.value();
	}


	/**
	 * @
	 */
	@Override
	public boolean contains(E value) {
		// TODO Auto-generated method stub
		DoubleNode<E> finger = head;
		while(finger != null && !finger.value().equals(value)){
			finger.next();
		}
		return finger != null;
	}

}

