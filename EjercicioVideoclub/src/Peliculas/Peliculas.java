package Peliculas;

import java.util.Date;

public class Peliculas {
	
	private String director;
	private String titulo;
	private Date a�o;
	
	
	
	
	public Peliculas(String director, String titulo, Date a�o) {
		
		this.director = director;
		this.titulo = titulo;
		this.a�o = a�o;
	}
	
	
	public String getDirector() {
		return director;
	}
	public String getTitulo() {
		return titulo;
	}
	public Date getA�o() {
		return a�o;
	}

	
	
}
