package andi;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Datum: ");
		String s=sc.next();
		
		LocalDate heute=LocalDate.now();  //Heute
		
		DateTimeFormatter deutschFormatierer = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		LocalDate bis = LocalDate.parse(s, deutschFormatierer);
		
		double d=Double.parseDouble("123.45");
		
		//Period periode=Period.between(heute, bis);
		long days = ChronoUnit.DAYS.between(heute, bis);
		///long minutes = ChronoUnit.MINUTES.between(heute, bis);
		
		System.out.printf("Noch %d Tage bis %s\n",
				days,bis.toString());
		System.out.printf("Noch %d Minuten bis %s\n",
				days*24*60,bis.toString());

		
		
	}

}
