package ar.edu.unq.pconc.tp6.ej1;

public class ThreadDecrementadorDeContador extends Thread {

	private Contador contador;
	
	public ThreadDecrementadorDeContador(Contador contador) {
		super();
		this.contador = contador;
	}
	
	@Override
	public void run() {
		while (true) {
			contador.decrementar();
		}
	}
	
}