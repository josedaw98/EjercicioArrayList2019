package Videoclub;

import com.jose.beans.Director;
import com.jose.beans.Peliculas;
import com.jose.print.ImprimirConsola;

import ListadoPeliculas.Netflix;

public class Start {

	public static void main(String[] args) {

		Director spilberg = new Director();
		spilberg.setNombre("Steven Spilberg");
		
		Director copola = new Director();
		copola.setNombre("Francis Ford Copola");
		
		
		Peliculas et = new Peliculas();
		et.setDirector(spilberg);
		et.setAño(1982);
		et.setTitulo("E.T.");
		et.setPresupuesto(4567.34);

		
		Peliculas tiburon = new Peliculas();
		tiburon.setDirector(spilberg);
		tiburon.setAño(1975);
		tiburon.setTitulo("Tiburón");
		tiburon.setPresupuesto(46567.34);
		
		
		Netflix baseDatosPeliculas = new Netflix();
		baseDatosPeliculas.addPelicula(et);
		baseDatosPeliculas.addPelicula(tiburon);
		
		
		
		ImprimirConsola.imprimir(baseDatosPeliculas.getPeliculas());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}