package com.jose.arrayList.inicio;

public class Persona {

	private String nombre, apellidos, ciudad;
	private int telefono, edad , peso;

	public Persona(String nombre, String apellidos, String ciudad, int telefono , int edad, int peso) {

		this.nombre = nombre;
		this.apellidos = apellidos;
		this.ciudad = ciudad;
		this.telefono = telefono;
		this.edad = edad;
		this.peso = peso;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", ciudad=" + ciudad + ", telefono="
				+ telefono + ", edad=" + edad + ", peso=" + peso + "]";
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

}
