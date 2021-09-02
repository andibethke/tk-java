package de.andi;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Rechner {

	private String filename="C:\\Temp\\tk-java\\kurse.txt";
	private KursModel kurs;
	private double betragInEur;
	
	public Rechner(String symbol) throws Exception{
		Optional<KursModel> kurs=getKurse(filename)
				.stream()
				.filter(x->x.getSymbol().equalsIgnoreCase(symbol))
				.findFirst();
		if(kurs.isEmpty())
			throw new Exception("Währung nicht gefunden");
		else {
			this.kurs=kurs.get();
		}
	}

	
	public KursModel getKurs() {
		return kurs;
	}

	public double getBetragInEur() {
		return betragInEur;
	}


	public void setBetragInEur(double betragInEur) {
		this.betragInEur = betragInEur;
	}

	public double getBetragFremd() {
		return betragInEur*kurs.getKurs();
	}
	
	public static List<KursModel> getKurse(String fn) throws Exception{
		return Files.readAllLines(Paths.get(fn))
				.stream()
				.map(zeile->{
					String[] felder=zeile.split(";");
					return new KursModel(felder[0], 
										 felder[1], 
										 felder[2], 
										 Double.parseDouble(felder[3]));
				})
				.collect(Collectors.toList());
				
	}


}
