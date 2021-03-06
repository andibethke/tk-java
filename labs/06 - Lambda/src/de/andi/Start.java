package de.andi;

public class Start {

	public static void main(String[] args) {
		//Dennis
		ElsasKlasse ek=new ElsasKlasse();
		System.out.printf("Summe: %d\n", ek.getSumme());
		System.out.printf("MW: %d\n", ek.getMW());

		System.out.printf("Produkt: %d\n", ek.execute((q,w)->q*w));
		System.out.printf("Min: %d\n", ek.execute((q,w)->q>w?w:q));
		System.out.printf("Max: %d\n", ek.execute((q,w)->q<w?w:q));
	}

}
@FunctionalInterface
interface Algorithmus{
	public int proc(int x, int y);

}


class ElsasKlasse{
	private int a=222,b=444;
	
	public int getSumme() {
		return a+b;
	}
	public int getMW() {
		return (a+b)/2;
	}
	
	public int execute(Algorithmus algo) {
		return algo.proc(a, b);
	}
	
	
}
