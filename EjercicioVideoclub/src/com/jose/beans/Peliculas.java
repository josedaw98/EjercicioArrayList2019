package com.jose.beans;

import java.util.Date;

public class Peliculas {
	
	@Override
	public String toString() {
		return "Peliculas [director=" + director + ", titulo=" + titulo + ", a�o=" + a�o + ", presupuesto="
				+ presupuesto + "]";
	}
	private Director director;
	private String titulo;
	private int a�o;
	private double presupuesto;
	
	
	
	
	
	
	

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getA�o() {
		return a�o;
	}

	public double getPresupuesto() {
		return presupuesto;
	}
	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	
	
}
