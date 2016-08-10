import java.util.Scanner;

/**
 * 
 */

/**
 * @author Pareja 9 Hugo Elvira 15249 y Edgar Ramírez 15236
 * @version 11/08/2016
 */

public class MainPostFix {

	/**
	 * 
	 */
	public MainPostFix() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @descripcion: permite una interaz entre el usuario y el computador
	 * @param args
	 */
	public static void main(String[] args) {
		
		Calculadora c=new Calculadora();
		
		System.out.println("Bienvenido");
        System.out.println("Por favor introduzca el nombre del archivo que contiene la operacion a calcular, seguido de .txt");
        String entradaTeclado = "";
        Scanner in = new Scanner(System.in);
        entradaTeclado = in.nextLine();
        System.out.println("");
        System.out.println(c.ToString());
        System.out.println(c.Calcular(c.LeerArchivo(entradaTeclado)));

	}

}
