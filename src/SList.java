/**
 * @author Pareja 9 Hugo Elvira 15249 y Edgar Ramírez 15236 (solo modificamos algunas cosas)
 * @version 11/08/2016
 * @description: lista simplemente enlazada (codigo reutilizado de internet con fines universitarios, autor original JULIO)
 */


public class SList<E> extends AbstractList<E> {
	
	protected Node<E> head; 

	/**
	 * 
	 */
	
	public SList() {
		// TODO Auto-generated constructor stub
		head = null;
		count = 0;
	}


	/**
	 * @
	 */
	@Override
	public void addFirst(E value) {
		// TODO Auto-generated method stub
		head = new Node<E>(value,head); 
		count++;
		
	}


	/**
	 * @
	 */
	@Override
	public E removeFirst() {
		// TODO Auto-generated method stub
		Node<E> temp = head;
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
		Node<E> finger = head;
		Node<E> previous = null;
		while(finger.next() != null){
			previous = finger;
			finger = finger.next();
			}
		if(previous == null){
			head = null;
		}
		else{
			previous.setNext(null);
		}
		count--;
		return finger.value();
	}


	/**
	 * @
	 */
	@Override
	public void addLast(E value) {
		// TODO Auto-generated method stub
		Node<E> temp = new Node<E>(value,null);
		if (head != null){
			Node<E> finger = head;
			while(finger.next() != null){
				finger = finger.next();
			}
			finger.setNext(temp);
		}
		else{
			head = temp;
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
		Node <E> finger = head;
		while(finger.next() != null){
			finger = finger.next();
		}
		return finger.value();
	}


	/**
	 * @
	 */
	@Override
	public boolean contains(E value) {
		// TODO Auto-generated method stub
		Node<E> finger = head;
		while(finger != null && !finger.value().equals(value)){
			finger.next();
		}
		return finger != null;
	}

}