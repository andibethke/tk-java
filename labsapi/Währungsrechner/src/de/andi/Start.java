package de.andi;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) throws Exception{
		Rechner k=null;
		Scanner sc=new Scanner(System.in);
		System.out.print("Währung: ");
		try {
			k=new Rechner(sc.next());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			main(args);
		}
		System.out.print("Betrag in EUR: ");
		k.setBetragInEur(sc.nextDouble());
		
		System.out.printf("Betrag in %s: %.2f %s",
				k.getKurs().getBezeichnung(),
				k.getBetragFremd(),
				k.getKurs().getSymbol());
		

	}

}
