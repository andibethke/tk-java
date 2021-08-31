package de.andi;

public class Singleton {
	private static Singleton instance=null;
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		if(instance==null)
			new Singleton();
		return instance;
	}
	
}
