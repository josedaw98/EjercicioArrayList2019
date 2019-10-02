package ListadoPeliculas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import com.jose.beans.Director;
import com.jose.beans.Peliculas;

public class Netflix {

	
		private HashMap <String , Peliculas> peliculasTitulo ;
		private HashMap <Integer , Peliculas> peliculasAnio ;
		private HashMap<Director, ArrayList<Peliculas>> peliculasDirector ;
		
		
		public Netflix() {
			
			peliculasTitulo = new HashMap <String , Peliculas>();
			peliculasAnio = new HashMap <Integer , Peliculas>();
			peliculasDirector = new HashMap <Director, ArrayList<Peliculas>>();
		}

		/*
		 * Añade a cada mapa la pelicula 
		 * metodo de añadir peliculas
		 */
		
		public void addPelicula(Peliculas pelicula) {
			
			peliculasTitulo.put(pelicula.getTitulo(), pelicula);
			
			if(peliculasDirector.containsKey(pelicula.getDirector())) {
				if(peliculasDirector.get(pelicula.getDirector()).add(pelicula)) {
					System.out.println(" la pelicula ya se encuentra en la lista");
				}else {
					peliculasDirector.get(pelicula.getDirector()).add(pelicula);
				}
			}else{
				ArrayList<Peliculas> peliculas = new ArrayList<Peliculas>();
				peliculas.add(pelicula);
				peliculasDirector.put(pelicula.getDirector(),peliculas);
			}
			
			
			
			peliculasAnio.put(pelicula.getAño(), pelicula);
		}
		
		
		
		
		/*
		 * 
		 * Metodos para buscar peliculas por difeentes parametros
		 * 
		 * 
		 */
		
		public Peliculas getPelicula(String titulo) {
			return peliculasTitulo.get(titulo);
		}
		
		public Peliculas getAnio(String anio) {
			return peliculasAnio.get(anio);
		}
		
		public ArrayList<Peliculas> getDirector(Director director) {
			return peliculasDirector.get(director);
		}
		
		
		public Iterator<Pelicula> getPeliculas() {
			
			return peliculasDirector.values().iterator();
		}
}
