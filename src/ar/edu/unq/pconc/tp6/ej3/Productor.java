package ar.edu.unq.pconc.tp6.ej3;

public class Productor extends Thread {

	private Buffer buffer;
	
	public Productor(Buffer buffer) {
		this.buffer = buffer;
	}
	
	public void run() {
		try {
			int i = 0;
			while (true) {
				buffer.write(i);
				System.out.println("Escrito " + i);
				i++;
			}
		} catch ( InterruptedException e) {}
	}
	
}
