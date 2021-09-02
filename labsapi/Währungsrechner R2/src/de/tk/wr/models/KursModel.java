package de.tk.wr.models;

public class KursModel {
	private String land, symbol, bezeichnung;
	private double wechselkurs;
	public KursModel(String land, String symbol, String bezeichnung, double wechselkurs) {
		super();
		this.land = land;
		this.symbol = symbol;
		this.bezeichnung = bezeichnung;
		this.wechselkurs = wechselkurs;
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
	public double getWechselkurs() {
		return wechselkurs;
	}
	public void setWechselkurs(double wechselkurs) {
		this.wechselkurs = wechselkurs;
	}
	
}
