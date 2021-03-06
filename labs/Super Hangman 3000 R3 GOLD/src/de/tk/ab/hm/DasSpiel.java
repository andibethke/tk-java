package de.tk.ab.hm;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class DasSpiel {
	private String geheimesWort, anzeige="";
	private int anzahlFehler=0;
	
	public DasSpiel() throws Exception {  //Defaultkonstruktor
		List<String> alleWoerter=
				Files.readAllLines(Paths.get("c:/temp/tk-java","deutsch.txt"),
						Charset.forName("iso-8859-1"));
		Random r=new Random();
		int zufall=r.nextInt(alleWoerter.size());
		geheimesWort=alleWoerter.get(zufall);
		
		for (int i = 0; i < geheimesWort.length(); i++) {
			anzeige+="-";
		}
	}
	public String getAnzeige() {return anzeige;}
	public int getAnzahlFehler() {return anzahlFehler;}
	public boolean isTot() {return anzahlFehler>10;}
	public boolean isGewonnen() {return geheimesWort.equals(anzeige);}
	
	public void eingabe(String zeichen) {
		String tmp="";
		boolean isFound=false;
		for (int i = 0; i < geheimesWort.length(); i++) {
			if(geheimesWort.toUpperCase().charAt(i)==zeichen.toUpperCase().charAt(0)) {
				tmp+=geheimesWort.charAt(i);
				isFound=true;
			}
			else {
				tmp+=anzeige.charAt(i);
			}
		}
		anzeige=tmp;
		if(!isFound) anzahlFehler++;
	}
	
}
