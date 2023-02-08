package parte2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import parte1.MainPt1;

public class MainPt2 extends Thread {

	static Logger log = LoggerFactory.getLogger(MainPt1.class);
	static int totaleThread1;
	static int totaleThread2;
	static int totaleThread3;

	public static void main(String[] args) throws InterruptedException {

		submit();

	}

	public static void submit() throws InterruptedException {
		
		
		Thread1 a = new Thread1(1000);
		Thread2 b = new Thread2(1000);
		Thread3 c = new Thread3(1000);
		a.start();
		a.join();

		b.start();
		b.join();

		c.start();
		c.join();

		log.info("Somma totale dei Threads: " + totaleThread1+"+"+totaleThread2+"+"+totaleThread3+" = " + (totaleThread1 + totaleThread2 + totaleThread3));
		
	}

}
