package ar.edu.unq.pconc.tp6.ej3;

import java.util.ArrayList;
import java.util.List;

public class Buffer {
	
	private List<Integer> data = new ArrayList<Integer>();
	private int limite;
	
	public Buffer(int N) {
		super();
		limite = N;
	}
	
	synchronized void write(Integer n) throws InterruptedException {
		while (isFull()) { 
			wait(); 
		}
		data.add(n);
		notify();
	}
	
	synchronized List<Integer> read() throws InterruptedException {
		while (isEmpty()) { 
			wait(); 
		}
		List<Integer> nums = new ArrayList<Integer>();
		nums.addAll(data);
		data.clear();
		notify();
		return nums;
	}
	
	private boolean isEmpty() { 
		return data.size() == 0;
	}
	
	private boolean isFull() { 
		return data.size() == limite; 
	}
	
}
