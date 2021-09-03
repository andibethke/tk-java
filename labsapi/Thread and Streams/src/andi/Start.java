package andi;

import java.util.stream.Stream;

public class Start {

	public static void main(String[] args) {
		
		//System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "3");
		
		Stream<Integer> stream=Stream.of(4,7,2,5,7);
		
		stream
			.parallel()
			.map(i->{
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
				}
				System.out.printf("Thread Nr: %d map...\n",Thread.currentThread().getId());
				return i*2;
			})
			.forEach(i->{
				System.out.printf("Thread Nr: %d foreach: ",Thread.currentThread().getId());
				System.out.println(i);	
			});
		
		System.out.println("ENDE");
	}

}
