package com.jose.arrayList.print;

import com.jose.arrayList.beans.Persona;
import com.jose.arrayList.error.FueraDeRangoException;
import com.jose.arrayList.negocio.ListaPersonas;

public class ImprimirConsola {
	
	/**
	 *  Metodo estatico que me permite imprimir sin que haya un objeto creado
	 * @param lista ListaPersonas a imprimir 
	 * @throws Exception 
	 */ 
	
	public static void imprirmirListaPersona(ListaPersonas lista) throws Exception {
		
		for(int i=0;i<lista.getElementos();i++) {
			
			//probamos que no haya  errores e imprimimos la informacion
			try {
				
				Persona persona = lista.getPersona(i);
				
				System.out.println("*******" );
				System.out.println(persona.getNombre());
				
			} catch (FueraDeRangoException e) {
			System.out.println("ERROOR");
			}
			
		}
	}

}
