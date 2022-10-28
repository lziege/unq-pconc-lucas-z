package ar.edu.unq.pconc.tp6.ej1;

public class Contador {
	
	private int contador = 0;
	
	synchronized void incrementar () {
		contador++;
		System.out.println(contador);
	}
	
	synchronized void decrementar () {
		contador--;
		System.out.println(contador);
	}
	
}