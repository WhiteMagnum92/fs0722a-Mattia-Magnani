package parte2;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import parte1.MainPt1;

public class Thread3 extends Thread {
	
	int[] arr;
	int sum = 0;
	static Random rand = new Random();
	static Logger log = LoggerFactory.getLogger(MainPt1.class);
	
	public Thread3(int x) {
		this.arr=new int[x];
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(750);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inserisci();
		somma();
		MainPt2.totaleThread3=sum;
		try {
			Thread.sleep(1200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int somma() {
		for(int i = 0;i<=this.arr.length-1;i++) {
			sum+=this.arr[i];
		}
		log.info("Somma Thread 3: "+sum);
		return sum;
	}
	
	public void inserisci() {
		for(int i =0;i<=this.arr.length-1;i++) {
			int rndm = rand.nextInt(78);
			this.arr[i]=rndm;
		}
	}

}
