package de.tk.wr.console;

import java.util.Scanner;

import de.tk.wr.business.KursRechner;

public class Start {

	public static void main(String[] args) {
		KursRechner rechner=null;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Währung: ");
		try {
			rechner=new KursRechner(sc.next());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			main(args);
		}
		System.out.print("Betrag: ");
		rechner.setBetragInEuro(sc.nextDouble());
		
		System.out.printf("Betrag in %s: %.2f %s",
				rechner.getKurs().getBezeichnung(),
				rechner.getBetragFemd(),
				rechner.getKurs().getSymbol());

	}

}
