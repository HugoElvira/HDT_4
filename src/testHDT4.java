import static org.junit.Assert.*;


import org.junit.Test;
/**
 * @author Pareja 9 Hugo Elvira 15249 y Edgar Ramírez 15236
 * @version 11/08/2016
 */

public class testHDT4 {
	
	int resultado=0;
	String cadena1;

	@Test
	public void test() {
		 Calculadora c = new Calculadora(1,1);
			try {
				c.LeerArchivo("texto.txt");
			}  
			catch (Exception e) {
				e.printStackTrace();
			}
			
			try {
				resultado =c.Calcular(c.LeerArchivo("texto.txt"));
			}
			catch (Exception NullPointerException){
				System.out.println("Error en calcular");
			}
			System.out.println("resultado= "+c.Calcular(c.LeerArchivo("texto.txt")));        	
			
			assertEquals(40, resultado);
	}
	
	@Test
	public void test1() {
		 Calculadora c = new Calculadora(3,1);
			try {
				cadena1=c.LeerArchivo("texto.txt");
			}  
			catch (Exception e) {
				e.printStackTrace();
			}
			
			try {
				resultado =c.Calcular(c.LeerArchivo("texto.txt"));
			}
			catch (Exception NullPointerException){
				System.out.println("Error en calcular");
			}
			System.out.println("resultado= "+c.Calcular(c.LeerArchivo("texto.txt")));        	
			
			assertEquals(40, resultado);
	}
	
	@Test
	public void test2() {
		 Calculadora c = new Calculadora(3,1);
			try {
				c.LeerArchivo("texto.txt");
			}  
			catch (Exception e) {
				e.printStackTrace();
			}
			
			try {
				cadena1=c.LeerArchivo("texto.txt");
			}
			catch (Exception NullPointerException){
				System.out.println("Error en calcular");
			}
			System.out.println("operacion= "+c.LeerArchivo("texto.txt"));        	
			
			assertEquals("3 5 + 5 *", cadena1);
	}


}
