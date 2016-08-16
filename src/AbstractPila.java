/**
 * 
 */

/**
 * @author Pareja 9 Hugo Elvira 15249 y Edgar Ramírez 15236
 * @version 11/08/2016
 * @descripcion: permite poder usar como de tipo AbstractPila los distintos tipos de Pila
 */

public abstract class AbstractPila<E> implements I_Stack<E> {
	
	/**
	 * @description: retorna true o false segun corresponda para indicar lleno o vacio
	 */
	public boolean isEmpty(){
        return Size() == 0;
    }

}
