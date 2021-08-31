package de.andi;

public class Start {

	public static void main(String[] args) {
		B a=new B();
		a.setWert(100);

		System.out.println(a);

	}

}

class A{
	private int wert=0;

	public int getWert() {
		return wert;
	}

	public void setWert(int wert) {
		this.wert = wert;
	}
	@Override
	public String toString() {
		return String.format("Wert: %d", wert);
	}
}
class B extends A{
	private String name="";
	@Override
	public void setWert(int wert) {
		super.setWert(wert*2);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}