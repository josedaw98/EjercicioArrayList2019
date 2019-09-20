package com.jose.arrayList.negocio;

import java.util.ArrayList;
import java.util.Iterator;

import com.jose.arrayList.beans.Persona;
import com.jose.arrayList.error.FueraDeRangoException;

public class ListaPersonas {
	
	//Usaremos un ArrayList internamente para funcionar
	private ArrayList listaInterna;
	
	public ListaPersonas() {
		listaInterna = new ArrayList<Persona>();
	}
	
	/**
	 * esta operacion introduce un objeto persona en la 
	 * lista de personas
	 * @param persona Persona e insertar
	 */
	
	public void addPersona(Persona persona) {
		
		//uso la lista interna y me ayudo de ella 
		listaInterna.add(persona);
		
	}
	
	/**
	 * tamaño de la lista
	 * 
	 * @return el numero de elementos que posee la lista 
	 */
	
	public int getElementos() {
		
		//devuelvo el tamaño de la lista
		return listaInterna.size();
		
	}
	
	/**
	 * Recoge la persona indicada por el indice
	 * 
	 * @param index la posicion de la persona solicitada
	 * @return el obejto persona en esa posicion
	 * @throws Exception FueraDeRangoException error producido 
	 */
	
	
	public Persona getPersona(int index) throws Exception {
		
		if ((index >= 0) && (index < listaInterna.size())) {
			
		
		return  (Persona) listaInterna.get(index);
		
		}
		
		throw new FueraDeRangoException("te has equivocado en el tamaño");
		
	}
	
	public Iterator<Persona> getPersonas(){
		return listaInterna.iterator();
		
		
	}

}
