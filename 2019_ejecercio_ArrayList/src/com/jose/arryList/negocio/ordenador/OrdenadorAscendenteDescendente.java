package com.jose.arryList.negocio.ordenador;

import java.util.Comparator;

import com.jose.arrayList.beans.Persona;

public class OrdenadorAscendenteDescendente implements Comparator<Persona> {
	
	public static final int ORDENACION_ASCENDENTE=1000;
	public static final int ORDENACION_DESCENDENTE=2000;
	/*
	 * CRITERO ORDENACION
	 * 
	 * 1000=asc 2000=desc POR DEFECTO:asc
	 */

		int metodoPeso;
		int metodoEdad;
		
		public OrdenadorAscendenteDescendente() {
		
		metodoEdad = ORDENACION_ASCENDENTE;
		metodoPeso = ORDENACION_ASCENDENTE;
	}
		
	@Override
	public int compare(Persona p1, Persona p2) {
		
		if (p1.getEdad() == p2.getEdad()) {
				switch(metodoPeso) {
				
				case ORDENACION_ASCENDENTE:return p1.getPeso() - p2.getPeso(); //igual 1;
				case ORDENACION_DESCENDENTE:return p2.getPeso() - p1.getPeso();//igual-1;
				default : return p1.getPeso() - p2.getPeso(); //igual 1;
				}
			
		} else { 
			
			switch(metodoEdad) {
			
				case ORDENACION_ASCENDENTE:return p1.getEdad() - p2.getEdad(); // igual 1;
				case ORDENACION_DESCENDENTE:return p2.getEdad() - p1.getEdad();//igual -1;
				default : return p1.getEdad() - p2.getEdad();//igual 1;
		}
			
		}
		
		
	}
	
	/*Metodo cambiar edad
	 * 
	 * le netragmos un int y cambia el metodo de comparacion
	 */
	public void setMetodoEdad(int metodoEdad) {
		this.metodoEdad = metodoEdad;
	}
	
	/*Metodo cambiar peso
	 * 
	 * le netragmos un int y cambia el metodo de comparacion
	 */
	public void setMetodoPeso(int metodoPeso) {
		this.metodoPeso = metodoPeso;
	}
	
	
}
