package andi;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;


public class Start {

	static int summe=0;
	static Object o=new Object();
	
	static AtomicInteger aSum=new AtomicInteger(0);
	
	static void add() {
		synchronized (o) {
			summe++;
		}
	}

	public static void main(String[] args) throws Exception {
		ExecutorService executorService=Executors.newFixedThreadPool(2);
		for (int x = 0; x < 5; x++) {
			executorService.execute(new Thread(()->{
				System.out.printf("Thread Nr: %d startet...\n",Thread.currentThread().getId());
				for (int i = 0; i < 1000000; i++) {
					add();
					aSum.addAndGet(1);
				}
				System.out.printf("Thread Nr: %d ended...\n",Thread.currentThread().getId());
			}));
		}
		
		executorService.awaitTermination(1,TimeUnit.SECONDS); //sync.
		
		System.out.println("Summe: "+summe);
		System.out.println("Atomic Summe: "+aSum.get());
	}


}


