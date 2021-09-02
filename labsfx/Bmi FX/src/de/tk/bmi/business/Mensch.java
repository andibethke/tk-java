package de.tk.bmi.business;

public class Mensch {
	private double groesse=0, gewicht=0;

	public double getGroesse() {
		return groesse;
	}

	public void setGroesse(double groesse) {
		this.groesse = groesse;
	}

	public double getGewicht() {
		return gewicht;
	}

	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}
	public double getBmi() {
		return gewicht/(groesse*groesse);
	}
	public boolean isOk() {
		return getBmi()>19 && getBmi()<24;
	}
}
