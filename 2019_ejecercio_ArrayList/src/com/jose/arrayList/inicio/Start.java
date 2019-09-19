package com.jose.arrayList.inicio;

import java.util.ArrayList;

public class Start {

	public static void main(String[] args) {
		
		
		Persona n1 = new Persona("Jose " , "Rojo" , "Oviedo" , 650251743);
		Persona n2 = new Persona("Carlos " , "Costales" , "Gijon" , 674926483);
		Persona n3 = new Persona("Pablo" , "Carvajal" , "Aviles" , 763823514);
		Persona n4 = new Persona("Alvaro" , "Roces" , "Oviedo" , 957452736);
		
		MiLista Metodos =  new MiLista();
		MiLista.addPersona(n1);
		MiLista.addPersona(n2);
		MiLista.addPersona(n3);
		MiLista.addPersona(n4);
		
		ImprimirConsola imprimir = new ImprimirConsola(MiLista.getPersonas());
	}

	

}
