package de.andi;

public class KursModel {
	private String land, symbol, bezeichnung;
	private double kurs;
	public KursModel(String land, String symbol, String bezeichnung, double kurs) {
		super();
		this.land = land;
		this.symbol = symbol;
		this.bezeichnung = bezeichnung;
		this.kurs = kurs;
	}
	public String getLand() {
		return land;
	}
	public void setLand(String land) {
		this.land = land;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getBezeichnung() {
		return bezeichnung;
	}
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	public double getKurs() {
		return kurs;
	}
	public void setKurs(double kurs) {
		this.kurs = kurs;
	}
	
	
}
