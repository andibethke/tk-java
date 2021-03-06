package de.andi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Start {

	public static void main(String[] args) {
		List<Artikel> lager=new ArrayList<Artikel>();
		
		lager.add(new JitArtikel(10));
		lager.add(new TkArtikel(10));
		lager.add(new TkArtikel(10));
		lager.add(new Tastatur(5));
		
		
		
		System.out.printf("Lagerwert: %.2f ?",
				lager.stream().map(x->x.getVk()).collect(Collectors.summingDouble(x->x)));
		
	}
}

abstract class Artikel{
	protected double ek=0;

	public Artikel(double ek) {
		super();
		this.ek = ek;
	}
	
	public abstract double getVk();
}
class JitArtikel extends Artikel{

	public JitArtikel(double ek) {
		super(ek);
	}

	@Override
	public double getVk() {
		return ek*1.5;
	}
}
class TkArtikel extends Artikel{

	public TkArtikel(double ek) {
		super(ek);
	}

	@Override
	public double getVk() {
		return ek*3;
	}
}
class Tastatur extends Artikel{

	public Tastatur(double ek) {
		super(ek);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getVk() {
		return ek*2;
	}
	
}
