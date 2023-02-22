/**
 * 
 */
package modificadores;

import modificadores.paquetea.A;
import paquetec.C;

/**
 *
 */
public class Modificadores {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		A a = new A();  //A no es accesible, aunque esté en un subpaquete
		System.out.println(a.getA());
		B b = new B();		
		System.out.println(b.b); //Esta opción no suele ser recomendable
		System.out.println(b.getB());
		
		C c = new C();
		//System.out.println(c.c); //Si intentamos acceder al atributo, error
		System.out.println(c.getC());
		
		

	}

}
