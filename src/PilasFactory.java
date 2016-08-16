/**
 * 
 */

/**
 * @author Pareja 9 Hugo Elvira 15249 y Edgar Ramírez 15236
 * @version 11/08/2016
 */

public class PilasFactory {
	
    /**
     * @Descripcion: instancia un objeto del tipo correspondiente segun los parametros pila y tipo en donde sea llamado
     */
    public AbstractPila getPila(int pila, int tipo ){
        if (pila==3)
            return new Pila<Integer>();
        
        if (pila==2)
            return new PilaArray<Integer>();
        
        if (pila==1)
        	return new PilaList<Integer>(tipo);
        
		return null;
        
    }
	
    /**
     *@Descripcion: instancia un objeto del tipo correspondiente segun los parametros pila y tipo en donde sea llamado
     */
    public AbstractList getList(int x){
        if (x==3)
            return new CList();
        if (x==1)
        	return new SList();
        else 
        	return new DList();
    }

}
