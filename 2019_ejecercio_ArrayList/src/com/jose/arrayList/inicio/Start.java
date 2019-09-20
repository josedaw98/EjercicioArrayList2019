package com.jose.arrayList.inicio;

import com.jose.arrayList.beans.Persona;
import com.jose.arrayList.error.FueraDeRangoException;
import com.jose.arrayList.negocio.ListaPersonas;
import com.jose.arrayList.print.ImprimirConsola;

public class Start {

	public static void main(String[] args) {

		Persona persona1 = new Persona();

		persona1.setNombre("maria");
		persona1.setApellidos("lopes");
		persona1.setTelefono("638746522");
		persona1.setCiudad("oviedo");
		persona1.setEdad(22);
		persona1.setPeso(81);

		ListaPersonas lista = new ListaPersonas();
		lista.addPersona(persona1);

		
		ImprimirConsola.imprirmirListaPersona(lista);	
		
	}

	

}
