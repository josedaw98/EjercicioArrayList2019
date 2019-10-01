package com.jose.arrayList.inicio;

import java.util.Collections;

import com.jose.arrayList.beans.Persona;
import com.jose.arrayList.error.FueraDeRangoException;
import com.jose.arrayList.negocio.ListaPersonas;
import com.jose.arrayList.print.ImprimirConsola;
import com.jose.arryList.negocio.ordenador.OrdenadorAscendenteDescendente;
import com.jose.arrayList.negocio.ordenador.OrdenadorPersonas;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona persona1 = new Persona();
		persona1.setNombre("Maria");
		persona1.setApellidos("López");
		persona1.setTelefono("656784356");
		persona1.setCiudad("Oviedo");
		persona1.setEdad(40);
		persona1.setPeso(56);

		Persona persona2 = new Persona();
		persona2.setNombre("Paco");
		persona2.setApellidos("García");
		persona2.setTelefono("654321267");
		persona2.setCiudad("Gijón");
		persona2.setEdad(40);
		persona2.setPeso(40);

		Persona persona3 = new Persona();
		persona3.setNombre("Rogelio");
		persona3.setApellidos("García");
		persona3.setTelefono("654321267");
		persona3.setCiudad("Gijón");
		persona3.setEdad(10);
		persona3.setPeso(90);

		ListaPersonas lista = new ListaPersonas();
		lista.addPersona(persona1);
		lista.addPersona(persona2);
		lista.addPersona(persona3);
		
		

		ImprimirConsola.imprimirListaPersonas(lista.getPersonas());

		OrdenadorAscendenteDescendente oad = new OrdenadorAscendenteDescendente();

		//op.ordenatePeso();
		oad.setMetodoEdad(OrdenadorAscendenteDescendente.ORDENACION_DESCENDENTE);
		oad.setMetodoPeso(OrdenadorAscendenteDescendente.ORDENACION_DESCENDENTE);
		lista.ordenar(oad);
		ImprimirConsola.imprimirListaPersonas(lista.getPersonas());
		
		oad.setMetodoEdad(OrdenadorAscendenteDescendente.ORDENACION_ASCENDENTE);
		oad.setMetodoPeso(OrdenadorAscendenteDescendente.ORDENACION_ASCENDENTE);
		lista.ordenar(oad);
		ImprimirConsola.imprimirListaPersonas(lista.getPersonas());
//		
//		op.ordenateEdad();
//		lista.ordenarEdad(op);
//		
//		ImprimirConsola.imprimirListaPersonas(lista.getPersonas());
		
		
		
	}

}
