package andi;

public class Start {

	public static void main(String[] args) {
		new Thread(()->{
			for (int i = 0; i < 100; i++) {
				System.out.print("*");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
				}
			}
		}).start();
		new Thread(()->{
			for (int i = 0; i < 50; i++) {
				System.out.print("#");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					
				}
			}
		}).start();
		System.out.println("Ende..");
	}

}
