import java.util.ArrayList;
import java.util.Vector;

/**
 * 
 */

/**
 * @author Pc
 *
 */
public class PilaArray<E> implements I_Stack<E> {
		
	private ArrayList<E> miPilaArray;
	
	public PilaArray() {
		   miPilaArray = new ArrayList<E>();
			}

	@Override
	public void Push(E element) {
	miPilaArray.add(element);
		
	}

	@Override
	public E Pop() {
		E x= (E) miPilaArray.remove(miPilaArray.size()-1);
		return x;
	}

	@Override
	public boolean IsEmpty() {
		boolean y;
		if(miPilaArray.size()==0){y=true;}
		else {y=true;}
		return y;
	}

	@Override
	public int Size() {
		return miPilaArray.size();
	}

	@Override
	public E get() {
		// TODO Auto-generated method stub
		return null;
	}

}
