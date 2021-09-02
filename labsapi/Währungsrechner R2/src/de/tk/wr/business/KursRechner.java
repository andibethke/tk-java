package de.tk.wr.business;

import java.util.Optional;

import de.tk.wr.models.KursModel;

public class KursRechner {
	private KursModel kurs;
	private double betragInEuro;
	
	
	public KursRechner(String symbol) throws Exception{
		Optional<KursModel> kurs=new KursLoader().getKurse()
				.stream()
				.filter(k->k.getSymbol().equalsIgnoreCase(symbol))
				.findFirst();
		if (kurs.isPresent()) {
			this.kurs=kurs.get();
		}
		else {
			new Exception("Währung nicht vorhanden...");
		}
	}


	public double getBetragInEuro() {
		return betragInEuro;
	}


	public void setBetragInEuro(double betragInEuro) {
		this.betragInEuro = betragInEuro;
	}


	public KursModel getKurs() {
		return kurs;
	}
	public double getBetragFemd() {
		return betragInEuro*kurs.getWechselkurs();
	}
	
	
}
