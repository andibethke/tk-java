package de.zk.prim;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {

		int von=leseVonTastatur("von: ");
		int bis=leseVonTastatur("bis: ");
		
		for (int i = von; i <=bis; i++) {
			if(istPrimzahl(i)) {
				System.out.println(i);
			}
		}
	}

	private static int leseVonTastatur(String prompt) {
		Scanner sc=new Scanner(System.in);
		System.out.print(prompt);
		try {
			return sc.nextInt();
		} catch (Exception e) {
			System.out.println("Falsche Eingabe...");
			return leseVonTastatur(prompt);  //Rekursion
		}
	}

	private static boolean istPrimzahl(int zahl) {
		if(zahl<2) return false;
		for(int teiler=2; teiler<zahl; teiler++) {
			if(zahl % teiler ==0)
				return false;
		}
		return true;
	}

}
