import java.io.BufferedReader;
import java.io.FileReader;

/**
 * 
 */

/**
 * @author Pareja 9 Hugo Elvira 15249 y Edgar Ram�rez 15236
 * @version 11/08/2016
 * @Description Realiza la operacion contenida en el archivo .txt
 */
public class Calculadora implements I_Calculadora{

	/**
	 * 
	 */
    private AbstractPila<Integer> pila;
    PilasFactory Pilafactory = new PilasFactory(); 

	/**
	 *@constructor crea el objeto segun los parametros usando la clase factory
	 */
    public Calculadora(int Pila, int tipo){
        pila = Pilafactory.getPila(Pila,tipo);
    }
	
	/**
	 *@descripcion: recibe la l�nea de texto desde el documento txt y devuelve el total segun la operacion
	 */
	@Override
	public int Calcular(String vector) {
	int total=0;
	
	String[] Arreglo = vector.split(" ");// se pasa el texto a un arreglo tomando cada elemento separado por espacio
	
	for(String arreglo: Arreglo){ //se recorre el arreglo con foreah
		try{
		pila.Push(Integer.parseInt(arreglo)); //se verifica si el elemento es un numero, si s� lo guarda en pila
		}
		catch(Exception e){ //si el elemento no era un numero, se verifica las 4 posibilidades de operando existentes para calcular el total
			switch(arreglo){
			case "+":
				total = (int) (pila.Pop() + pila.Pop());
				pila.Push(total);
				break;
				
			case "*":
				total = (int)(pila.Pop() * pila.Pop());
				pila.Push(total);
				break;
				
			case "/":
				total = (int)pila.Pop() / (int)pila.Pop();
				pila.Push(total);
				break;
				
				
			case "-":
				total = -(int)pila.Pop() + (int)pila.Pop();
				pila.Push(total);
				break;
			}
		}
		}
	
		return total;		//una vez recorrido el arreglo se devuelve el total
	}
	
	/**
	 *@descripcion: imprime el texto previo al resultado
	 */
	@Override
	public String ToString() {
		String res="El resultado es: ";
		return res;
	}
	
	/**
	 *@descripcion: Lee el archivo .txt
	 */
	@Override
	public String LeerArchivo(String direccion) {
		
		String operacion = "";
		try{
			BufferedReader direc = new BufferedReader(new FileReader(direccion));
			String leer;
			while((leer = direc.readLine()) != null){ // se lee linea por linea
				operacion = operacion + leer;		//se concatena el texto		
			}
		
		}
		catch(Exception e){//si no se puedo leer el archivo, genera este error
			System.err.println("No puede leerse el archivo");
		}
		return operacion;//devuelve el texto el archivo .txt

	}

}
