package Peliculas;

import java.util.Date;

public class Peliculas {
	
	private String director;
	private String titulo;
	private Date año;
	
	
	
	
	public Peliculas(String director, String titulo, Date año) {
		
		this.director = director;
		this.titulo = titulo;
		this.año = año;
	}
	
	
	public String getDirector() {
		return director;
	}
	public String getTitulo() {
		return titulo;
	}
	public Date getAño() {
		return año;
	}

	
	
}
