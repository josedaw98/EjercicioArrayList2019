package com.jose.arrayList.negocio.ordenador;

import java.util.Comparator;
import com.jose.arrayList.beans.Persona;

public class OrdenadorPersonas implements Comparator<Persona> {

	/*
	 * CRITERIO ASCENDENTE Y DESCENDENTE
	 * 
	 * ASCENDENTE = 10; DESCENDENTE = 20: DEFECTO = ASCENDENTE;
	 * 
	 * 
	 */

	private int criterio;

	@Override
	public int compare(Persona p1, Persona p2) {

		switch (criterio) {

		case 10:
			if (p1.getEdad() == p2.getEdad()) {

				return p1.getPeso() - p2.getPeso();
			} else {
				return p1.getEdad() - p2.getEdad();
			}

		case 20:
			if (p2.getEdad() == p1.getEdad()) {

				return p2.getPeso() - p1.getPeso();
			} else {
				return p2.getEdad() - p1.getEdad();
			}

		default:
			if (p2.getEdad() == p1.getEdad()) {

				return p2.getPeso() - p1.getPeso();
			} else {
				return p2.getEdad() - p1.getEdad();
			}

		}

	}

	public void ordenarAsce() {

		criterio = 10;
	}

	public void ordenarDesc() {

		criterio = 20;
	}

	/*
	 * CRITERO ORDENACION
	 * 
	 * 1000=EDAD 2000=PESO POR DEFECTO:POR PESO
	 * 
	 * 
	 * private int criterio = 2000;
	 * 
	 * @Override public int compare(Persona p1, Persona p2) {
	 * 
	 * switch(criterio) { case 1000: return p1.getEdad() - p2.getEdad(); case 2000:
	 * return p1.getPeso() - p2.getPeso(); default: return p1.getEdad() -
	 * p2.getEdad(); }
	 * 
	 * 
	 * }
	 * 
	 * public void ordenatePeso() {
	 * 
	 * criterio=2000; }
	 * 
	 * public void ordenateEdad() {
	 * 
	 * criterio=1000; }
	 * 
	 */

}
