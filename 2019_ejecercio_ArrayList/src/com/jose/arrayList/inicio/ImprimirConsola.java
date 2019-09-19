package com.jose.arrayList.inicio;

import java.util.ArrayList;

public class ImprimirConsola extends MiLista{
	
	

	public ImprimirConsola(ArrayList <Persona> personas) {
		
		for(int i=0;i<getLongitud();i++) {
			System.out.println(getPersona(i).getNombre() + " " + getPersona(i).getApellidos() + " " + getPersona(i).getCiudad() + " " + getPersona(i).getTelefono());
		}
		
	}

}
