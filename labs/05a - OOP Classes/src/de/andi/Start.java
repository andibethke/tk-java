package de.andi;

import java.util.stream.Stream;

public class Start {

	public static void main(String[] args) {
		{
			EineKlasse a; // [null]

			a = new EineKlasse();

			try {
				a.setPrivField("x");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			try {
				a.setPrivField("klaus");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			System.out.println(a.getPrivField());
			a.verdoppleDich1().verdoppleDich1().verdoppleDich1();
			System.out.println(a.getPrivField());

			new EineKlasse("Techniker");
			a=null;
		}
		System.gc(); // ???
	}

}
