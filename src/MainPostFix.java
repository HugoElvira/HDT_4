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
	}

	/**
	 * @descripcion: permite una interaz entre el usuario y el computador
	 * @param args
	 */
	public static void main(String[] args) {
		
		String entradaTeclado = "";
		int ciclo=0;
		int pila=0;
		int tipo=0;
		
		while(ciclo==0){
			
		System.out.println("Bienvenido");
        System.out.println("Por favor elija el tipo de implementacion de pila para la calculadora POSTFIX");
        System.out.println("");
        System.out.println("1. Listas");
        System.out.println("2. ArrayList");
        System.out.println("3. Vector");
        
        
        Scanner in = new Scanner(System.in);
        entradaTeclado = in.nextLine();
        	
        
 
        	if(entradaTeclado.equals("1")){
        		pila=1;
        		tipo=1;
        		ciclo=1;
        	}
        	
        	if(entradaTeclado.equals("2")){
        		pila=2;
        		tipo=0;
        		ciclo=2;
        	}
        	
        	if(entradaTeclado.equals("3")){
        		pila=3;
        		tipo=0;
        		ciclo=2;
        	}
        	
        	
        	while(ciclo==1){
        		System.out.println("");
                System.out.println("Por favor elija el tipo de lista para implementar la pila");
                System.out.println("");
                System.out.println("1. Simplemente enlazadas");
                System.out.println("2. Doblemente enlazadas");
                System.out.println("3. Cirlular");
                
                
                entradaTeclado = in.nextLine();
                
            	if(entradaTeclado.equals("1")){
            		pila=1;
            		tipo=1;
            		ciclo=2;
            	}
            	
            	if(entradaTeclado.equals("2")){
            		pila=1;
            		tipo=2;
            		ciclo=2;
            	}
            	
            	if(entradaTeclado.equals("3")){
            		pila=1;
            		tipo=3;
            		ciclo=2;
            	}
            	
            	if(Integer.parseInt(entradaTeclado)>3 || Integer.parseInt(entradaTeclado)<0){
            		System.out.println("Por favor ingrese una opcion valida");
            		ciclo=1;
            		tipo=0;
            		pila=0;
            	}
            	
                
                
                	
        		
        	}
        	
        	if(Integer.parseInt(entradaTeclado)>3 || Integer.parseInt(entradaTeclado)<0){
        		System.out.println("Por favor ingrese una opcion valida");
        		ciclo=0;
        		tipo=0;
        		pila=0;
        	}
        	
        	
        }
        
		 
        

		Calculadora c=new Calculadora(pila,tipo);

        System.out.println("");
        System.out.println(c.ToString());
        System.out.println(c.Calcular(c.LeerArchivo("texto.txt")));

	}

}
