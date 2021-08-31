package de.tk.plz.models;

public class PlzModel {
	private String plz,ort,landkreis,bundesland;

	public PlzModel(String plz, String ort, String landkreis, String bundesland) {
		super();
		this.plz = plz;
		this.ort = ort;
		this.landkreis = landkreis;
		this.bundesland = bundesland;
	}

	public String getPlz() {
		return plz;
	}

	public String getOrt() {
		return ort;
	}

	public String getLandkreis() {
		return landkreis;
	}

	public String getBundesland() {
		return bundesland;
	}
	
}
