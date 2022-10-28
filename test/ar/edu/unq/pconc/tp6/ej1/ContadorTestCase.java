package ar.edu.unq.pconc.tp6.ej1;

class ContadorTestCase {

	public static void main(String[] args) throws InterruptedException {
		Contador contador = new Contador();
		ThreadIncrementadorDeContador ti1 = new ThreadIncrementadorDeContador(contador);
		ThreadDecrementadorDeContador td1 = new ThreadDecrementadorDeContador(contador);
		ThreadDecrementadorDeContador td2 = new ThreadDecrementadorDeContador(contador);
		ThreadDecrementadorDeContador td3 = new ThreadDecrementadorDeContador(contador);
		
		ti1.start();
		td1.start();
		td2.start();
		td3.start();
		
		Thread.sleep(1);
		
		ti1.stop();
		td1.stop();
		td2.stop();
		td3.stop();
	}
	
}
