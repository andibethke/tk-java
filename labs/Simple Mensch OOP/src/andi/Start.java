package andi;

public class Start {

	public static void main(String[] args) {
		Mensch andi=new Vip("Andi",1.86,95);
		
		
		while (andi.zuDick()) {
			System.out.println(andi);
			System.out.println("1 h Sport machen");
			andi.bewegDich();
		}
		System.out.println(andi);
	}

}

class Vip extends Mensch
{

	public Vip(String name, double gr??e, double gewicht) {
		super(name, gr??e, gewicht);
	}
	@Override
	public boolean zuDick() {
		return getGewicht()/(getGr??e()*getGr??e()) > 27;
	}
	
}



class Mensch{
	private String name;
	private double gr??e, gewicht;
	
	public Mensch(String name, double gr??e, double gewicht) {
		super();
		this.name = name;
		this.gr??e = gr??e;
		this.gewicht = gewicht;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGr??e() {
		return gr??e;
	}
	public void setGr??e(double gr??e) {
		this.gr??e = gr??e;
	}
	public double getGewicht() {
		return gewicht;
	}
	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}
	
	
	public void esse() {
		gewicht++;
	}
	public void bewegDich() {
		gewicht--;
	}
	
	public boolean zuDick() {
		return gewicht/(gr??e*gr??e) > 24;
	}
	@Override
	public String toString() {
		return String.format("%s ist %s", name, zuDick()?"zu Dick!":"wohl gen?hrt...");
	}
}
