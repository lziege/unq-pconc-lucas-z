package ar.edu.unq.pconc.tp6.ej1;

public class ThreadIncrementadorDeContador extends Thread {
	
	private Contador contador;
	
	public ThreadIncrementadorDeContador(Contador contador) {
		super();
		this.contador = contador;
	}

	@Override
	public void run() {
		while (true) {
			contador.incrementar();
		}
	}
	
}