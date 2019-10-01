package PruebasMaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona persona1 = new Persona();
		persona1.setDni("11111111");
		persona1.setNombre("persona1");
		
		Persona persona2 = new Persona();
		persona2.setDni("22222222");
		persona2.setNombre("persona2");
		
		Persona persona3 = new Persona();
		persona3.setDni("33333333");
		persona3.setNombre("persona3");
		
		Persona persona4 = new Persona();
		persona4.setDni("44444444");
		persona4.setNombre("persona4");
		
		Persona persona5 = new Persona();
		persona5.setDni("55555555");
		persona5.setNombre("persona5");
		
		Persona persona6 = new Persona();
		persona6.setDni("55555555");
		persona6.setNombre("persona6");
		

		
		
		

		HashMap<String, Persona> datos = new HashMap<String, Persona>();
		
		datos.put(persona1.getDni(), persona1);
		datos.put(persona2.getDni(), persona2);
		datos.put(persona3.getDni(), persona3);
		datos.put(persona4.getDni(), persona4);
		datos.put(persona5.getDni(), persona5);
		datos.put(persona6.getDni(), persona6);
		
		Map<String, Persona> miMap = datos;
		
		/*dejo de utilizar el HashMap y utilizo el Map
		
		System.out.println(miMap.keySet());
		
		Iterator<String> iterador = miMap.keySet().iterator();
		while(iterador.hasNext()) {
			System.out.print(iterador.next() + " , ");
		}
		
		
		
		Persona persona = miMap.get("33333333");
		System.out.println("recuperando datos....");
		System.out.println(persona);
		
		*/
		Iterator<Persona > iterador = miMap.values().iterator();
		System.out.println("salida HashMap *****************");
		while(iterador.hasNext()) {
			
			Persona persona = iterador.next();
			System.out.println(persona);
		}
	}

}
