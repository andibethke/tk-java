package de.tk.ab.hm;

import java.util.Scanner;

public class StartConsole {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			DasSpiel spiel=new DasSpiel();
			while (true) {
				System.out.println(spiel.getAnzeige());
				System.out.printf("%d Fehler> ", spiel.getAnzahlFehler());
				spiel.eingabe(sc.next());
				
				if (spiel.isGewonnen() || spiel.isTot()) {
					break;
				}
			} //end of while
			if(spiel.isGewonnen()) {
				System.out.println("HERZLICHEN GLÜCKWUNSCH");
			}
			else {
				System.out.println("Du bist Tot, Alter!");
			}
			
			
		} catch (Exception e) {
			System.out.println("deutsch.txt nicht gefunden...");
		}

	}

}
