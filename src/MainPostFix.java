import java.util.Scanner;

/**
 * 
 */

/**
 * @author Grupo 8 Hugo Elvira, Dieter de Wit, Gerardo Cardoza
 * @version 25/07/2016
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
