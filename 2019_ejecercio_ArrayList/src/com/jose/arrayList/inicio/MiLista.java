package com.jose.arrayList.inicio;

import java.util.ArrayList;

public class MiLista  {
	

	private static ArrayList <Persona> personas = new ArrayList<Persona>();

	public static void addPersona(Persona persona) {
		getPersonas().add(persona);
	}
	

	
	public  int getLongitud() {
		return getPersonas().size();
		
	}
	
	public Persona getPersona(int i) {
		return getPersonas().get(i);
	}



	public static ArrayList <Persona> getPersonas() {
		return personas;
	}



	
	
	

}
