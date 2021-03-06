package de.andi;

public class EineKlasse {
	//Felder
	public String pubField; //public b?se!
	private String privField;
	protected String protField;
	private boolean an;
	//PropertyMethods / Accessoren
	public String getPrivField() {
		return privField;
	}
	public void setPrivField(String privField) throws Exception {
		if(privField.length()<2)
			throw new Exception("Zu kurz...");
		
		this.privField=privField.substring(0,1).toUpperCase()+
							privField.substring(1);
	}
	public boolean isAn() {
		return an;
	}
	public void setAn(boolean an) {
		this.an = an;
	}
	//Methoden 
	public void verdoppleDich() {
		privField+=privField;
	}
	public EineKlasse verdoppleDich1() {  //Chaining
		privField+=privField;
		return this;
	}
	
	//Konstruktor
	public EineKlasse() {  //Default
		System.out.println("Eine Objekt von EineKlasse wurde geboren");
	}
	public EineKlasse(String wert) {  //?berladener
		this();
		privField=wert;
	}
	
	//Destruktor
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Eine Objekt von EineKlasse stirbt...");
	}
	
	
	
}
