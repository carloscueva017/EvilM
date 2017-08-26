package tads;

import tads.fecha.Fecha;
import tads.fecha.Fechas;

public class Main {

	public static void main(String[] args) {
		
		Fecha cabildo = new Fecha(1810, 5, 25);
		String fechaConFormato = Fechas.toString(cabildo);
		System.out.println(fechaConFormato);
	}
	
	
}
