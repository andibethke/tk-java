package de.tk.andi;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * 
 * @author andi_
 *
 */

public class Start {

	//Zeilenkommentar
	/*
	 * Bereichskommentar
	 */
	/**
	 * Dokumentationskommentar
	 * @param args Consolenparameter
	 * @author andi
	 * @
	 */
	public static void main(String[] args) {
		Integer i2=234;
		Boolean b=true;
		float f=234.23f;
		String s="dfgfgd";
		Character c='d';
		
		//+ - / * % =
		//++ -- += -= *=
		//Logische: > < >= <= == ! !=   && ||
		//Bit: | & << >>
		//cast: (typ) val
		Integer i=(int)f;
		
		System.out.println( i>300?"Hallo":"HUHUH" );
		
		Date d=new Date();
		System.out.println(d.getMinutes());
		
		
		
	}
	
	

}
