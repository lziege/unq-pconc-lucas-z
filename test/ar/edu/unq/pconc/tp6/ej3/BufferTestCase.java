package ar.edu.unq.pconc.tp6.ej3;

class BufferTestCase {

	public static void main(String[] args) throws InterruptedException {
		Buffer buffer = new Buffer(2);
		Productor p = new Productor(buffer);
		Consumidor c = new Consumidor(buffer);
		Consumidor c2 = new Consumidor(buffer);
		Consumidor c3 = new Consumidor(buffer);
		
		p.start();
		c.start();
		
		Thread.sleep(1);
		
		p.stop();
		c.stop();
	}

}
