package ar.edu.unq.pconc.tp6.ej3;

import java.util.List;

public class Consumidor extends Thread {

	private Buffer buffer;
	
	public Consumidor(Buffer buffer) {
		this.buffer = buffer;
	}
	
	public void run() {
		try {
			while (true) {
				List<Integer> nums = buffer.read();
				System.out.println("Leido " + nums);
			}
		} catch (InterruptedException e) {}
	}
	
}
