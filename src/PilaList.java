/**
 * 
 */

/**
 * @author Pareja 9 Hugo Elvira 15249 y Edgar Ramírez 15236
 * @version 11/08/2016
 */

public class PilaList<E> extends AbstractPila<E> {
	
    protected AbstractList<E> list;
    protected PilasFactory Tlist = new PilasFactory();
    
    public PilaList(int TList){
    	list= Tlist.getList(TList);
    	
    }

	@Override
	public void Push(E element) {
		list.addLast(element);
		
	}

	@Override
	public E Pop() {
		E x=list.removeLast();
		return x;
	}

	@Override
	public boolean IsEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int Size() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public E get() {
		// TODO Auto-generated method stub
		return null;
	}

}
