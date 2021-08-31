package de.andi;

public class A {
	private int wert=0;
	private int wert2=0;
	private static int statisch=0; //Class-Member
	
	public A() {
		statisch++;
		System.out.printf("%d. Instanz wurde geboren...\r\n",statisch);
	}
	
	public A(int wert, int wert2) {
		super();
		this.wert = wert;
		this.wert2 = wert2;
	}
	public int getWert() {
		return wert;
	}
	public void setWert(int wert) {
		this.wert = wert;
	}
	public int getWert2() {
		return wert2;
	}
	public void setWert2(int wert2) {
		this.wert2 = wert2;
	}
	public static int getStatisch() {
		return statisch;
	}
	public static void setStatisch(int statisch) {
		A.statisch = statisch;
	}
	
	
}
