import java.util.ArrayList;
import java.util.Vector;

/**
 * 
 */

/**
 * @author Pareja 9 Hugo Elvira 15249 y Edgar Ramírez 15236
 * @version 11/08/2016
 */

public class PilaArray<E> extends AbstractPila<E> {
		
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
