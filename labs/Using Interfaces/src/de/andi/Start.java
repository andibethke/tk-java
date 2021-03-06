package de.andi;

import java.util.Arrays;
import java.util.Comparator;

public class Start {

	public static void main(String[] args) {
		String[] names= {"Iryna","Fabian","Jakob","Elsa","Dennis","Andi"};
		
		//Eigene Klasse
		Arrays.sort(names, new MeinNachLšngerSortierer());
		for (String n : names) { System.out.println(n);}
		//local Benannter Typ
		Comparator<String> mnlsa=new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.toString().length()>o2.toString().length()?-1:1;
			}
		};
		Arrays.sort(names, mnlsa);
		for (String n : names) { System.out.println(n);}
		//annonymer Typ
		Arrays.sort(names, new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		for (String n : names) { System.out.println(n);}
		//Lamda (Functional Interface) KURZ
		Arrays.sort(names, (o1,o2) -> o1.compareTo(o2));
		for (String n : names) { System.out.println(n);}

		//Lamda (Functional Interface) LANG
		Arrays.sort(names, (String o1, String o2) -> {return o1.compareTo(o2);});
		for (String n : names) { System.out.println(n);}
		
		
		
	}

}

class MeinNachLšngerSortierer implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		return o1.toString().length()<o2.toString().length()?-1:1;
	}
	
}