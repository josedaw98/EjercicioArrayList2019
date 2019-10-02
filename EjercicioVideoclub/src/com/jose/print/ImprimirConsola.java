package com.jose.print;

import java.util.Iterator;

import com.jose.beans.Peliculas;




public class ImprimirConsola {

	
	
public static void imprimir(Iterator<Peliculas> datos) {
		
		System.out.println("***************************");
		System.out.println("Peliculas disponibles");
		while(datos.hasNext()) {
			
			Peliculas pelicula = datos.next();
			System.out.println(pelicula);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}