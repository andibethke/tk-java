package de.andi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Start {

	public static void main(String[] args) {
		List<Artikel> lager=new ArrayList<Artikel>();
		
		lager.add(new JitArtikel());
//		lager.add(new TkArtikel(10));
//		lager.add(new TkArtikel(10));
//		lager.add(new Tastatur(5));
		
		
		
		System.out.printf("Lagerwert: %.2f ?",
				lager.stream().map(x->x.getVk()).collect(Collectors.summingDouble(x->x)));
	}

}

interface Artikel{
	public void setEk(double val);
	public double getVk();
}

class JitArtikel implements Artikel{
	private double val=30;
	@Override
	public void setEk(double val) {
		this.val=val;
		
	}

	@Override
	public double getVk() {
		return val*1.5;
	}
	
}
