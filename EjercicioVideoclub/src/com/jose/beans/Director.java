package com.jose.beans;

public class Director {

		@Override
	public String toString() {
		return "Director [nombre=" + nombre + "]";
	}

		private  String nombre;

		public  String getNombre() {
			return nombre;
		}

		public  void setNombre(String nombre1) {
			nombre = nombre1;
		}
		
}
